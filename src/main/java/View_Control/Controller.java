package View_Control;
import Model.Dilwsi;
import View_Control.*;
import Model.Foititis;
import Model.Grammateia;
import Model.Kathigitis;
import Model.Mathima;
import Model.ProgrammaSpoudwn;


import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) throws FileNotFoundException {
        
        ProgrammaSpoudwn ps = new ProgrammaSpoudwn("PS 2020", "1/1/2020", "Tmhma Mhxanikwn Plhforofikhs kai Hlektronikwn Systhmatwn");
        Kathigitis k1 = new Kathigitis("Ignatios Deligiannis", "H.O.P", "ignation@it.teithe.gr", true, "ignatios", "password");
        
        Foititis f1 = new Foititis("it174964","password","Kyriakos","Ouzounis","kyriakos.ouzounis@gmail.com","3939393","NOOOT 65",1,12);
        Dilwsi d1 = new Dilwsi(1,12,42);
        Grammateia g1 = new Grammateia("email","aitima","It","it");
        
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
            File myObj = new File("C:\\Users\\kyriakos\\Desktop\\Enrollment.txt");
                if (myObj.createNewFile()) {
                  System.out.println("File created: " + myObj.getName());
                } else {
                  System.out.println("File already exists.");
           }
           } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
           }
           d1.enrollTo(m2);
           g1.sendEnrollment(f1, d1);
           


        Foititis f2=f1.getFoititis("it175099");
        System.out.println(f2);

    }
}
