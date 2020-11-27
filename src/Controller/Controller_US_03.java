package Controller;
import Model.*;
import View.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller_US_03 {
    private static Model.Grammateia grammateia=null;
    private static Model.Kathigitis kathigitis=null;
    private static Model.Foititis foititis=null;

    
    public Controller_US_03() {
    }
    public Model.Kathigitis returnKathigiti(){return this.kathigitis;}
    public Model.Grammateia returnGrammateia(){return this.grammateia;}
    public String FgetOnoma() {
        
        return foititis.getOnoma();
    }
    public String FgetEpwnymo() {
        return foititis.getEpwnymo();
    }
    public String FgetEmail() {
        return foititis.getEmail();
    }
    public String FgetTel() {
        return foititis.getTel();
    }
    public String FgetAddress() {
        return foititis.getAddress();
    }
    public int FgetTypiko_eksa() {
        return foititis.getTypiko_eksa();
    }
    public int FgetDm() {
        return foititis.getDm();
    }
    public String KgetOnoma() {
        return this.kathigitis.getOnoma();
    }
    public String KgetEidikotita() {
        return this.kathigitis.getEidikotita();
    }
    public String KgetEmail() {
        return this.kathigitis.getEmail();
    }
    public boolean KgetDigital_signature() {
        return this.kathigitis.getDigital_signature();
    } 
    public String GgetEmail() {
        return this.grammateia.getEmail();
    }
    public String GgetUsername(){
        return this.grammateia.getUsername();
    }
    
    /*
    *Η showOptions() ανάλογα με τον Τύπο του αντικειμένου (Foititis,Kathigitis,Grammateia)
    *καλεί/δημιουργεί το κατάλληλο JFrame στο UI
    */
    public int showOptions(Object object) throws IOException
    {
        if(object instanceof Model.Foititis)
        {
            View.Foititis foititis = new View.Foititis();
            foititis.setVisible(true);
            foititis.toFront();
            return 0;
        }
        else if (object instanceof Model.Kathigitis)
        {
            View.Kathigitis kathigitis = new View.Kathigitis();
            kathigitis.setVisible(true);
            kathigitis.toFront();
            return 0;
        }
        else if (object instanceof Model.Grammateia)
        {
            View.Grammateia grammateia = new View.Grammateia();
            grammateia.setVisible(true);
            grammateia.toFront();
            return 0;
        }
        else
        {
            return -1;
        }
    }
    /*Δεδομένου του Username και του Password
    *που πέρνω απο το UI διαβάζω το αρχείο accounts.txt
    *αν έχω match τότε αρχικοποιώ το ανάλογω αντικείμενο και καλω την showOptions()
    */
    public int verifyUser(String username,String password) throws FileNotFoundException, IOException
    {
        try
        {
            File foitites = new File(".\\src\\Resources\\accounts.txt");
            Scanner accountScanner = new Scanner(foitites);
            while (accountScanner.hasNextLine())
            {
                String line = accountScanner.nextLine();
                String parts[]=line.split(" ");
                if(parts[0].equals(username) && parts[1].equals(password))
                {    
                    if(Integer.parseInt(parts[2])==1)
                    {      
                        File gram = new File(".\\src\\Resources\\grammateia.txt");
                        Scanner initScanner = new Scanner(gram);
                        line = initScanner.nextLine();   
                        String loads[]=line.split(" ");
                        System.out.println("Loged-In as Grammateia.");
                        initScanner.close();
                        this.grammateia=new Model.Grammateia(loads[0], loads[1],loads[2]);
                        return this.showOptions(this.grammateia);
                        
                    }
                    else if(Integer.parseInt(parts[2])==2)
                    {
                        
                        File foit = new File(".\\src\\Resources\\foitites.txt");
                        Scanner initScanner = new Scanner(foit);
                        while(initScanner.hasNextLine())
                        {
                            line = initScanner.nextLine();  
                            String loads[]=line.split(" ");
                            if(parts[0].equals(loads[0]) && parts[1].equals(loads[1]))
                            {
                                System.out.println("Logged in as Foititis: "+loads[0]);
                                loads[6]=loads[6].replace("_", " ");
                                initScanner.close();
                                this.foititis=new Model.Foititis(loads[0],loads[1],loads[2],loads[3],loads[4],loads[5],loads[6],Integer.parseInt(loads[7]),Integer.parseInt(loads[8]));   
                                return this.showOptions(this.foititis);
                            }
                        }
                    }
                    else if(Integer.parseInt(parts[2])==3)
                    {
                        
                        File kathigites = new File(".\\src\\Resources\\kathigites.txt");
                        Scanner initScanner = new Scanner(kathigites);
                        while(initScanner.hasNextLine())
                        {
                            line = initScanner.nextLine();  
                            String loads[]=line.split(" ");
                            if(parts[0].equals(loads[0]) && parts[1].equals(loads[1]))
                            {
                                System.out.println("Logged in as Kathigitis: "+loads[0]);
                                loads[2]=loads[2].replace("_", " ");
                                loads[3]=loads[3].replace("_", " ");
                                this.kathigitis=new Model.Kathigitis(loads[0], loads[1], loads[2], loads[3], loads[4], Boolean.parseBoolean(loads[5]));    
                                return this.showOptions(kathigitis);
                            }
                        }
                    }      
                }
            }
            return -1;
        } 
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found!");
            e.printStackTrace();
            return -1;

        }
    }
    }

