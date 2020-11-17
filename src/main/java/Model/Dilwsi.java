package Model;

import java.util.ArrayList;

public class Dilwsi {

    private int akadimaiko_eksamino;
    private int hmeromhnia;
    private ArrayList<Mathima> lista_mathimatwn=new ArrayList<>();
    private int remainingDM;
    private Mathima afora;
    private ArrayList<Mathima> mathimata = new ArrayList<>();

    public Dilwsi(int akadimaiko_eksamino, int hmeromhnia, int remainingDM) {
        this.akadimaiko_eksamino = akadimaiko_eksamino;
        this.hmeromhnia = hmeromhnia;
        this.remainingDM = remainingDM;
    }

    public int getAkadimaiko_eksamino() {
        return akadimaiko_eksamino;
    }

    public int getRemainingDM() {
        return remainingDM;
    }
        
    public void enrollTo(Mathima course) {
        this.afora = course;
        mathimata.add(course);
    }
    
    public String toString() {
		System.out.println("\nh dilwsi me akadimaiko eksamino " + akadimaiko_eksamino + 
		" afora to "
			+ afora.getTitlos());
		return "";
    }
    
    public Boolean isEnrolled(Mathima course) {
        if (course != null) {
            return true;
        }
        return false;
    }
    
    public void unenrollFrom(Mathima course) {
        this.afora = null;
    }
    
    public ArrayList<Mathima> getEnrolledCourses() {
        return mathimata;
    }
   
}