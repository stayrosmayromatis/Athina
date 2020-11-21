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
                        //this.grammateia=new Model.Grammateia(loads[0], loads[1],loads[2]);
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
                                File gram = new File(".\\src\\Resources\\grammateia.txt");
                                Scanner gramScanner = new Scanner(gram);
                                line = gramScanner.nextLine();   
                                String load[]=line.split(" ");
                                System.out.println("Loged-In as Grammateia.");
                                gramScanner.close();
                                this.grammateia=new Model.Grammateia(load[0], load[1],load[2]);
                                initScanner.close();
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
        
    /*
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new File(".").getAbsolutePath());
        LOGIN DONE US03 DONE
        Controller_US_03 con = new Controller_US_03();
        Object obj= con.verifyUser("ignatios", "password");
        Kathigitis ignatios = (Kathigitis)obj;
        Grammateia grammateia = new Grammateia("info", "password","info@it.teithe.gr");
        
        US06 YPOVOLI DIORTHOSHS VATHMOLOGIAS
        //Δηλωση Π.Σ. και κάποια μαθήματα με καθηγητή .
        ProgrammaSpoudwn ps =new ProgrammaSpoudwn("P.S.2020", "1/1/2020", "Mhxanikwn Plhroforikhs kai Hlektronikwn Systhmatwn");
        
        //Δημιουργία Εξεταστικών περιόδων
        Eksetastiki xeimerinh= new Eksetastiki("Xeimerinh", "1/2/2020", null);
        Eksetastiki earinh= new Eksetastiki("Earinh", "1/6/2020", null);
        Eksetastiki septemvriou= new Eksetastiki("Septemvriou", "1/9/2020", null);
        Eksetastiki emvolimi= new Eksetastiki("Emvolimi", "1/4/2020", null);
        
        //Θετω για κάθε μάθημα τις διαθέσιμες εξεταστικές περιόδους
        Mathima prog1 =new Mathima(1510, "Prog_1", ignatios, ps);
        ArrayList<Eksetastiki> prog1_ekse= new ArrayList<>();
        prog1_ekse.add(xeimerinh);
        prog1_ekse.add(earinh);
        prog1_ekse.add(septemvriou);
        prog1_ekse.add(emvolimi);
        prog1.setEksetastikes(prog1_ekse);
        
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog2 =new Mathima(1511, "Prog_2", ignatios, ps);
        ArrayList<Eksetastiki> prog2_ekse= new ArrayList<>();
        prog2_ekse.add(xeimerinh);
        prog2_ekse.add(earinh);
        prog2_ekse.add(septemvriou);
        prog2.setEksetastikes(prog2_ekse);
        
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog3 =new Mathima(1512, "Prog_3", ignatios, ps);
        ArrayList<Eksetastiki> prog3_ekse= new ArrayList<>();
        prog3_ekse.add(xeimerinh);
        prog3_ekse.add(earinh);
        prog3_ekse.add(septemvriou);
        prog3.setEksetastikes(prog2_ekse);
        
        ps.addToPS(prog3);
        ps.addToPS(prog2);
        ps.addToPS(prog1);
        
        
        

        //Επιστροφή των μαθημάτων του καθηγητή που είναι logged In
        ArrayList<Mathima> mathimata_ignatiou=new ArrayList<>();
        mathimata_ignatiou.add(prog1);
        mathimata_ignatiou.add(prog2);
        mathimata_ignatiou.add(prog3);
        ignatios.setMathimata(mathimata_ignatiou);
        mathimata_ignatiou=ignatios.getMathimata();
        //Εμφανιση στην οθόνη - Ιδεατή λίστα
        for (int i = 0; i < mathimata_ignatiou.size(); i++) 
        {
            System.out.println(mathimata_ignatiou.get(i).getID()+" "+mathimata_ignatiou.get(i).getTitlos());
            
        }
        //Εστω επιλέγει το μάθημα στη θέση 0 της λίστας 
         for (int i = 0; i < mathimata_ignatiou.get(0).getEksetastikes().size(); i++) {
            System.out.println(mathimata_ignatiou.get(0).getEksetastikes().get(i).getKwdikos());;
            
        }
        //Τότε μου ξεκλειδώνει το πεδίο για εύρεση του Φοιτητή
        //περνάει παραμετρικά το AM απο το UI έστω το it174896
        Foititis f1=Foititis.getFoititis("it174896");
        System.out.println(f1);
        //ξεκλειδώνει το πεδίο για την βαθμολογία απο 0-10, έστω θέλω να διορθώσω το 4 και το κάνω 8
        DiorthosiVathmologias dv = new DiorthosiVathmologias(f1.getUsername(), ignatios, mathimata_ignatiou.get(0), 4.0,8.0, ignatios.getDigital_signature(), mathimata_ignatiou.get(0).getEksetastikes().get(0).getKwdikos());
        if(grammateia.createAithma(dv))
        {
            System.out.println("Στάλθηκε επιτυχώς το Αίτημα");
            System.out.println("Η Ουρά αιτήσεων για επικύρωση απο την Γραμματεία είναι μήκους: "+grammateia.getDiorthoseisVathmologias().size());
        }
        else
            System.out.println("Something went wrong");
        
        /*US06 DONE!
        
        /*US07 
        //Εμφανίζω όλες τις διαθέσιμες διορθώσεις βαθμολογιών που έχουν υποβληθεί απο καθηγητές
        for (int i = 0; i < grammateia.getDiorthoseisVathmologias().size(); i++) {
            System.out.println("Αίτηση "+(i+1)+" υποβλήθηκε απο: "+grammateia.getDiorthoseisVathmologias().get(i).getKathigitis().getOnoma()+", Μάθημα: "+grammateia.getDiorthoseisVathmologias().get(i).getMathima().getTitlos()+" για τον φοιτητή: "+grammateia.getDiorthoseisVathmologias().get(i).getAM_Foititi());
            
        }
        if(grammateia.getDiorthoseisVathmologias().get(0).checkDigitalSign(grammateia.getDiorthoseisVathmologias().get(0)))
        {
            System.out.println("Valid! Saving to archive.....");
        }
        else
        {
            System.out.println("Digital sign not valid! Cannot proceed");
        }
        //Έστω οτι επιλέγει την 0 θέση της λίστας
        
        
      
        ProgrammaSpoudwn ps = new ProgrammaSpoudwn("PS 2020", "1/1/2020", "Tmhma Mhxanikwn Plhforofikhs kai Hlektronikwn Systhmatwn");
        Kathigitis k1 = new Kathigitis("ignatios", "password", "Ignatios Deligiannis", "Software Engineer", "ignatios@it.teithe.gr", true);
        
        Foititis f1 = new Foititis("it174964","password","Kyriakos","Ouzounis","kyriakos.ouzounis@gmail.com","3939393","NOOOT 65",1,12);
        Dilwsi d1 = new Dilwsi(1,12,42);
  
        
        //ΟΡΙΖΩ ΛΙΣΤΑ ΜΑΘΗΜΑΤΩΝ 3 ΘΕΣΕΩΝ ΚΑΙ ΠΡΟΣΘΕΤΩ ΣΤΟ PS
        ArrayList<Mathima> mathima = new ArrayList<>(3);
        for (int i = 0; i <3; i++) {
            int s=i+1;
            mathima.add(new Mathima((int)(1510+i),(String)( "Programming "+(s)), k1, ps));
            ps.addToPS(mathima.get(i));
        }
        
        
        //ΘΕΤΩ ΤΗΝ ΛΙΣΤΑ ΩΣ ΜΑΘΗΜΑΤΑ ΤΟΥ Κ1
        k1.setMathimata(mathima);
        System.out.println("----MATHIMATA TOY KATHIGITI-------");
        ArrayList<Mathima> k_mthima = k1.getMathimata();
        for (int i = 0; i < k_mthima.size(); i++) {
            System.out.println(k_mthima.get(i).getID()+" "+k_mthima.get(i).getTitlos());
        }
        
        
        System.out.println("----MATHIMATA TOY PROGRAMMATOS SPOUDWN-------");
        //UNASSIGNED TEACHER
        Mathima m1 = new Mathima(1513, "Mathimatika_1", null, ps);
        Mathima m2 = new Mathima(1514, "Mathimatika_2", null, ps);
        ps.addToPS(m1);
        ps.addToPS(m2);
        //ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΜΑΘΗΜΑΤΩΝ ΤΟΥ PS
        ArrayList<Mathima> ps_mathimata = ps.getAllCourses();
        for (int i = 0; i < ps_mathimata.size(); i++) {
            System.out.println(ps_mathimata.get(i).getID()+" "+ps_mathimata.get(i).getTitlos());
        }
           System.out.println("--EVERYTHINH SUCCESSFULL!!");

        
           try {
            File myObj = new File("C:\\Users\\Stavros\\Desktop\\Enrollment.txt");
                if (myObj.createNewFile()) {
                  System.out.println("File created: " + myObj.getName());
                } else {
                  System.out.println("File already exists.");
           }
           } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
           }
           d1.enrollTo(mathima.get(0));
           d1.enrollTo(mathima.get(1));
           d1.enrollTo(mathima.get(2));
           d1.enrollTo(m1);
           d1.enrollTo(m2);
          
           


        Foititis f2=f1.getFoititis("it175099");
        System.out.println(f2);
    
        */
    }

