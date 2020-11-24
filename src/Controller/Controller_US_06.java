/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stavros
 */
public class Controller_US_06 {
    private DiorthosiVathmologias dv;
    private Grammateia grammateia;
    private Controller_US_03 con3;
    private Model.Kathigitis kathigitis;
    private ProgrammaSpoudwn ps;
    private ArrayList<Model.Mathima> mathimata_kathigiti;
    
    
    public Controller_US_06() {
        this.con3 = new Controller_US_03();
        this.dv=null;
        this.grammateia=new Grammateia("info", "password"); //Dummy Object
        this.kathigitis= con3.returnKathigiti();
        this.ps = new ProgrammaSpoudwn("Tmhma Mhxanikwn Plhroforikhs DI.PA.E", "1/9/2019", "Tmhma Mhxaniwn Plhroforikhs");
        this.mathimata_kathigiti= new ArrayList<>();
    }
    
    /*
    *Οταν περνιέται όλο το αντικείμενο του καθηγητή
    *Τοτε επιστρέφεται όλο το ArrayList με τα μαθήματα του
    *Αρα πρέπει να επεξεργαστταν περνιέται όλο το αντικείμενο του καθηγητή
    *Τοτε επιστρέφεται όλο το ArrayList με τα μαεί στο UI όλο το arraylist ώστε να 
    *Εμφανιστεί ο Τίτλος και ο Κωδικός (με ενα for και χρήση .get())
    */
    public String[] getMathimataOfKathigitis()
    {
        
        ArrayList<Eksetastiki> prog1_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog2_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog3_ekse= new ArrayList<>();
        
        
        
        Mathima prog1 =new Mathima(1510,"Prog_1", this.kathigitis, ps);
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog2 =new Mathima(1511,"Prog_2", this.kathigitis, ps);
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog3 =new Mathima(1512,"Prog_3", this.kathigitis, ps);
        
        
        Eksetastiki xeimerinh= new Eksetastiki("Χειμερινή", "1/2/2020", null);
        Eksetastiki earinh= new Eksetastiki("Εαρινή", "1/6/2020", null);
        Eksetastiki septemvriou= new Eksetastiki("Σεπτέμβρη", "1/9/2020", null);
        Eksetastiki emvolimi= new Eksetastiki("Εμβόλιμη", "1/4/2020", null);
        
        prog1_ekse.add(xeimerinh);
        prog1_ekse.add(earinh);
        prog1_ekse.add(septemvriou);
        prog1_ekse.add(emvolimi);
        prog1.setEksetastikes(prog1_ekse);
        
        prog2_ekse.add(xeimerinh);
        prog2_ekse.add(earinh);
        prog2_ekse.add(septemvriou);
        prog2.setEksetastikes(prog2_ekse);
        
        
        prog3_ekse.add(xeimerinh);
        prog3_ekse.add(earinh);
        prog3_ekse.add(septemvriou);
        prog3.setEksetastikes(prog2_ekse);
        
        
        mathimata_kathigiti.add(prog1);
        mathimata_kathigiti.add(prog2);
        mathimata_kathigiti.add(prog3);
        
        this.kathigitis.setMathimata(mathimata_kathigiti);
        mathimata_kathigiti=this.kathigitis.getMathimata();
        String mathimata_titles[]=new String[mathimata_kathigiti.size()];
        for (int i = 0; i < mathimata_kathigiti.size(); i++) {
            mathimata_titles[i]=mathimata_kathigiti.get(i).getTitlos();
            
        }
        return mathimata_titles;
    }
    /*
    *Οταν περνιέται το μάθημα που έκανε click ο καθηγητής
    *Τοτε επιστρέφεται όλο το ArrayList με τις εξεταστικές που πέρνει μέρος το μάθημα
    *Αρα πρέπει να επεξεργαστεί στο UI όλο το arraylist ώστε να 
    *Εμφανιστεί ο Τίτλος της εξεταστικής ας πούμε
    */
    public String[] getEksetastikesOfMathima(String titlos_mathimatos)
    {
        String eksetastikes[]=null;
        for (int i = 0; i < mathimata_kathigiti.size(); i++) 
        {
            if(mathimata_kathigiti.get(i).getTitlos().equals(titlos_mathimatos))
            {
                eksetastikes=new String[mathimata_kathigiti.get(i).getEksetastikes().size()];
                for (int j = 0; j < mathimata_kathigiti.get(i).getEksetastikes().size(); j++) {
                    eksetastikes[j] = mathimata_kathigiti.get(i).getEksetastikes().get(j).getKwdikos();
                    
                }
                return eksetastikes;
            }            
        }
        return null;
    }
    /*
     *Εισάγωντας την τιμή απο το πλαίσιο, ένα μάθημα και μια εξεταστική απο τα επιστρεφόμενα Arraylists παραπάνω
    *Τοτε διατρέχεται το αρχείο με τις βαθμολογίες
    *Και επιστρέφεται πάλι σαν ArrayList o Foititis στην θέση 0 και η Βαθμολογία που είναι Double στην θέση 1
    */
    public double getVathmologia(String AM,String titlos_mathimatos, String eksetastiki) throws FileNotFoundException
    {
        Model.Mathima temp=null;
        for (int i = 0; i < mathimata_kathigiti.size(); i++) {
            if(mathimata_kathigiti.get(i).getTitlos().equals(titlos_mathimatos))
            {
                temp=mathimata_kathigiti.get(i);
                break;
            } 
        }
        File vathmologies = new File(".\\src\\Resources\\vathmologies.txt");
        Scanner vathScanner = new Scanner(vathmologies);
        while (vathScanner.hasNextLine())
        {
            String line = vathScanner.nextLine();
            String parts[]=line.split(" ");
            if(parts[0].equalsIgnoreCase(AM) && temp.getID()==Integer.parseInt(parts[1]) && eksetastiki.equals(parts[2]))
            {    
               vathScanner.close(); 
               return Double.parseDouble(parts[3]);
            }    
        } 
        vathScanner.close();
        return -1;
    }
    /*Τα αντικείμενα που πρέπει να περαστούν ως ορίσματα υπάρχουν στο UI σε μορφή ArrayLists
    * Άρα τα περνάς επιλέγοντας την κατάλληλη θέση της ArrayList
    */
    public void EisagogiDiorthosisVathmologias(String titlos_mathimatos,String eksetastikh,String AM,Double Palia_Vathm,Double Nea_Vathm) throws FileNotFoundException
    {
        Model.Foititis f_temp=Model.Foititis.getFoititis(AM);
        Model.Mathima m_temp=null;
        for (int i = 0; i < mathimata_kathigiti.size(); i++) {
            if(mathimata_kathigiti.get(i).getTitlos().equals(titlos_mathimatos))
            {
                m_temp=mathimata_kathigiti.get(i);
                break;
            } 
        }
            dv=new DiorthosiVathmologias(f_temp.getUsername(), this.kathigitis, m_temp.getID(), Palia_Vathm, Nea_Vathm, this.kathigitis.getDigital_signature(), eksetastikh);
            dv.setGrammateia(this.grammateia);
    }
    
    public boolean SaveVathmologia()
    {
        return this.grammateia.createAithma(this.dv);
    }

    public ArrayList<Eksetastiki> getEksetastikesOfMathima(ArrayList<Mathima> mathima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
