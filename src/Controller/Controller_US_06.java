/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stavros
 */
public class Controller_US_06 {
    DiorthosiVathmologias dv;
    Grammateia grammateia=new Grammateia("info", "password","info@it.teithe.gr");

    public Controller_US_06() {
        this.dv=null;
    }
    
    /*
    *Οταν περνιέται όλο το αντικείμενο του καθηγητή
    *Τοτε επιστρέφεται όλο το ArrayList με τα μαθήματα του
    *Αρα πρέπει να επεξεργαστταν περνιέται όλο το αντικείμενο του καθηγητή
    *Τοτε επιστρέφεται όλο το ArrayList με τα μαεί στο UI όλο το arraylist ώστε να 
    *Εμφανιστεί ο Τίτλος και ο Κωδικός (με ενα for και χρήση .get())
    */
    public ArrayList<Mathima> getMathimataOfKathigitis(Kathigitis kathigitis)
    {
        ArrayList<Model.Mathima> mathimata_kathigiti= new ArrayList<>();
        ProgrammaSpoudwn ps = new ProgrammaSpoudwn("DIPAE PROGRAMM", "1/1/2020", "Tmhma Mhxaniwn Plhroforikhs");
        Mathima prog1 =new Mathima(1510, "Prog_1", kathigitis, ps);
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog2 =new Mathima(1511, "Prog_2", kathigitis, ps);
        //Θετω για κάθε μάθημα διαθέσιμες εξεταστικές περιόδους
        Mathima prog3 =new Mathima(1512, "Prog_3", kathigitis, ps);
        mathimata_kathigiti.add(prog1);
        mathimata_kathigiti.add(prog2);
        mathimata_kathigiti.add(prog3);
        kathigitis.setMathimata(mathimata_kathigiti);
        return kathigitis.getMathimata();
    }
    /*
    *Οταν περνιέται το μάθημα που έκανε click ο καθηγητής
    *Τοτε επιστρέφεται όλο το ArrayList με τις εξεταστικές που πέρνει μέρος το μάθημα
    *Αρα πρέπει να επεξεργαστεί στο UI όλο το arraylist ώστε να 
    *Εμφανιστεί ο Τίτλος της εξεταστικής ας πούμε
    */
    public ArrayList<Eksetastiki> getEksetastikesOfMathima(Mathima mathima)
    {
        return mathima.getEksetastikes();
    }
    /*
     *Εισάγωντας την τιμή απο το πλαίσιο, ένα μάθημα και μια εξεταστική απο τα επιστρεφόμενα Arraylists παραπάνω
    *Τοτε διατρέχεται το αρχείο με τις βαθμολογίες
    *Και επιστρέφεται πάλι σαν ArrayList o Foititis στην θέση 0 και η Βαθμολογία που είναι Double στην θέση 1
    */
    public ArrayList getVathmologia(String AM,Mathima mathima, Eksetastiki eksetastiki) throws FileNotFoundException
    {
        Foititis temp_foititis=Foititis.getFoititis(AM);
        ArrayList returnedList= new ArrayList();
        File vathmologies = new File("C:\\Users\\Stavros\\Desktop\\vathmologies.txt");
        Scanner vathScanner = new Scanner(vathmologies);
        while (vathScanner.hasNextLine())
        {
            String line = vathScanner.nextLine();
            String parts[]=line.split(" ");
            if(parts[0].equalsIgnoreCase(AM) && mathima.getID()==Integer.parseInt(parts[1]) && eksetastiki.getKwdikos().equals(parts[2]))
            {    
               vathScanner.close(); 
               
               returnedList.add(temp_foititis);
               returnedList.add(Double.parseDouble(parts[3]));
               return returnedList;
            }    
        } 
        vathScanner.close();
        return returnedList;
    }
    /*Τα αντικείμενα που πρέπει να περαστούν ως ορίσματα υπάρχουν στο UI σε μορφή ArrayLists
    * Άρα τα περνάς επιλέγοντας την κατάλληλη θέση της ArrayList
    */
    public void EisagogiDiorthosisVathmologias(Kathigitis kathigitis,Mathima mathima,Foititis foititis,Double Palia_vathm,Double Nea_vathm,Eksetastiki eks)
    {
            dv=new DiorthosiVathmologias(foititis.getUsername(), kathigitis, mathima, Palia_vathm, Nea_vathm, kathigitis.getDigital_signature(), eks.getKwdikos());
    }
    
    public boolean SaveVathmologia()
    {
        return grammateia.createAithma(this.dv);
    }
}
