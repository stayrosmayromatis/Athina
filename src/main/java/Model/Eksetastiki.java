/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Stavros
 */
public class Eksetastiki {
    private String kwdikos;
    private String hmeromhnia;
    private ArrayList<Mathima> mathimata=new ArrayList<>();

    public Eksetastiki(String kwdikos, String hmeromhnia,ArrayList<Mathima> mathimata) {
        this.kwdikos = kwdikos;
        this.hmeromhnia = hmeromhnia;
        this.mathimata=mathimata;
    }

    public String getKwdikos() {
        return kwdikos;
    }

    public String getHmeromhnia() {
        return hmeromhnia;
    }

    public ArrayList<Mathima> getMathimata() {
        return mathimata;
    }

    public void setKwdikos(String kwdikos) {
        this.kwdikos = kwdikos;
    }

    public void setHmeromhnia(String hmeromhnia) {
        this.hmeromhnia = hmeromhnia;
    }

    public void setMathimata(ArrayList<Mathima> mathimata) {
        this.mathimata = mathimata;
    }
    
   

}
