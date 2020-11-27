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
    *Αναθέτουμε πρόχειρα μαθήματα σε καθηγητή ανάλογα 
    *με το username του, και προσθέτω εξεταστικές σε κάθε μάθημα
    */
    public void assignCoursesToTeacher()
    {
        ArrayList<Eksetastiki> prog1_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog2_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog3_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog4_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog5_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog6_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog7_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog8_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog9_ekse= new ArrayList<>();
        ArrayList<Eksetastiki> prog10_ekse= new ArrayList<>();
  
        Eksetastiki xeimerinh= new Eksetastiki("Χειμερινή", "1/2/2020", null);
        Eksetastiki earinh= new Eksetastiki("Εαρινή", "1/6/2020", null);
        Eksetastiki septemvriou= new Eksetastiki("Σεπτέμβρη", "1/9/2020", null);
        Eksetastiki emvolimi= new Eksetastiki("Εμβόλιμη", "1/4/2020", null);
        
        if (kathigitis.getUsername().equals("ignatios")){
            Mathima prog1 =new Mathima(1510,"Programmatismos", this.kathigitis, ps);   
            Mathima prog2 =new Mathima(1511,"Mixaniki Logismikou", this.kathigitis, ps);
            Mathima prog3 =new Mathima(1512,"Programmatismos 2", this.kathigitis, ps);
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
            prog3.setEksetastikes(prog3_ekse);
            
            mathimata_kathigiti.add(prog1);
            mathimata_kathigiti.add(prog2);
            mathimata_kathigiti.add(prog3);
            
            this.kathigitis.setMathimata(mathimata_kathigiti);
        }
        
        else if (kathigitis.getUsername().equals("euclid")) {
            Mathima prog4 =new Mathima(1513,"Baseis 1", this.kathigitis, ps);
            Mathima prog5 =new Mathima(1514,"Allilepidrasi", this.kathigitis, ps);
            Mathima prog6 =new Mathima(1515,"Baseis 2", this.kathigitis, ps);
            Mathima prog7 =new Mathima(1516,"Simasiologiko", this.kathigitis, ps);
            prog4_ekse.add(xeimerinh);
            prog4_ekse.add(earinh);
            prog4_ekse.add(septemvriou);
            prog4_ekse.add(emvolimi);
            prog4.setEksetastikes(prog4_ekse);

            prog5_ekse.add(xeimerinh);
            prog5_ekse.add(earinh);
            prog5_ekse.add(septemvriou);
            prog5.setEksetastikes(prog5_ekse);

            prog6_ekse.add(xeimerinh);
            prog6_ekse.add(earinh);
            prog6_ekse.add(septemvriou);
            prog6_ekse.add(emvolimi);
            prog6.setEksetastikes(prog6_ekse);

            prog7_ekse.add(xeimerinh);
            prog7_ekse.add(earinh);
            prog7_ekse.add(septemvriou);
            prog7.setEksetastikes(prog7_ekse);
            
            mathimata_kathigiti.add(prog4);
            mathimata_kathigiti.add(prog5);
            mathimata_kathigiti.add(prog6);
            mathimata_kathigiti.add(prog7);
            
            this.kathigitis.setMathimata(mathimata_kathigiti);
        }
        
        else if (kathigitis.getUsername().equals("antoniou")) {
            Mathima prog8 =new Mathima(1517,"Mathimatika 1", this.kathigitis, ps);
            Mathima prog9 =new Mathima(1518,"Statistiki", this.kathigitis, ps);
            Mathima prog10 =new Mathima(1519,"Mathimatika 2", this.kathigitis, ps);
            prog8_ekse.add(xeimerinh);
            prog8_ekse.add(earinh);
            prog8_ekse.add(septemvriou);
            prog8_ekse.add(emvolimi);
            prog8.setEksetastikes(prog8_ekse);

            prog9_ekse.add(xeimerinh);
            prog9_ekse.add(earinh);
            prog9_ekse.add(septemvriou);
            prog9.setEksetastikes(prog9_ekse);

            prog10_ekse.add(xeimerinh);
            prog10_ekse.add(earinh);
            prog10_ekse.add(septemvriou);
            prog10.setEksetastikes(prog10_ekse);
            
            mathimata_kathigiti.add(prog8);
            mathimata_kathigiti.add(prog9);
            mathimata_kathigiti.add(prog10);
            
            this.kathigitis.setMathimata(mathimata_kathigiti);
        }   
    }
    /*
    *Επιστρέφονται όλα τα μαθήματα του συγκεκριμένου καθηγητή που έκανε login
    *σε μία ArrayList.Επειτα τα επιστρέφω στο UI σε μορφή string.
    */
    public String[] getMathimataOfKathigitis()
    {
        assignCoursesToTeacher();
        mathimata_kathigiti=this.kathigitis.getMathimata();
        String mathimata_titles[]=new String[mathimata_kathigiti.size()];
        for (int i = 0; i < mathimata_kathigiti.size(); i++) {
            mathimata_titles[i]=mathimata_kathigiti.get(i).getTitlos();
            
        }
        return mathimata_titles;
    }
    /*
    *Επιστρέφονται ως String οι εξεταστικές του κάθε μαθήματος
    *που διδάσκει ο καθηγητής που έκανε login,δεχόμενο τον Τιτλο 
    *του μαθήματος απο το UI.
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
     *Εχοντας τις παραμέτρους ψάχνω στο αρχείο (βάση) για την βαθμολογία του φοιτητή
    *στο συγκεκριμενο μάθημα που επιλέχθηκε την συγκεκριμένη εξεταστική
    *και εφόσον το βρώ , επιστρέφω την βαθμοολογία σαν Double.
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
    /*
    *Για τον συγκεκριμένο φοιτητη,για μια εξεταστικη και έχοντας την παλια και νέα βαθμολογία 
    *δημιουργώ ένα αντικείμενο DiorthosiVathmologias το οποιο το προσθέτω στον καθηγητή
    *αλλά δεν το αποστέλω στην γραμματεία ακόμη
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
            this.kathigitis.addDiorthoshVathmologiasToKathigiti(dv);
    }
    /*
    *Εδω αποστέλω το αντικέιμενο DiorthosiVaymologias στην γραμματεία
    *η γραμματεία το γράφει σε ένα αρχείο και επιστρέφω μία boolean τιμή
    *ανάλογως την έκβαση.
    */
    public boolean SaveVathmologia()
    {
        return this.grammateia.createAithma(this.dv);
    }

    public ArrayList<Eksetastiki> getEksetastikesOfMathima(ArrayList<Mathima> mathima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
