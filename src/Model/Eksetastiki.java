package Model;

import java.util.ArrayList;

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
