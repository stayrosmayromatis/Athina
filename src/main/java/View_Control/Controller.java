/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Control;
import View_Control.*;
import Model.Foititis;
import Model.Grammateia;
import Model.Kathigitis;
import Model.Mathima;
import Model.ProgrammaSpoudwn;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ProgrammaSpoudwn ps = new ProgrammaSpoudwn("PS 2020", "1/1/2020", "Tmhma Mhxanikwn Plhforofikhs kai Hlektronikwn Systhmatwn");
        Kathigitis k1 = new Kathigitis("Ignatios Deligiannis", "H.O.P", "ignation@it.teithe.gr", true, "ignatios", "password");

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
        System.out.println("Everything OK!");
        
        System.out.println("Everything successfull");
        
        
        
    }
         
}
