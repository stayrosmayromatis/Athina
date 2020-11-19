package Model;
import java.util.ArrayList;

public class Mathima {
    private int ID;
    private String titlos;
    private String perigrafi;
    private int Dm;
    private Kathigitis kathigitis;
    private int wres;
    private ProgrammaSpoudwn ps;
    private Dilwsi anikeiSe;
    private ArrayList<Eksetastiki> eksetastikes= new ArrayList<>(); 

    public Mathima(int ID, String titlos, String perigrafi, int Dm, Kathigitis kathigitis, int wres, ArrayList<Eksetastiki> eksetastikes,ProgrammaSpoudwn ps) {
        this.ID = ID;
        this.titlos = titlos;
        this.perigrafi = perigrafi;
        this.Dm = Dm;
        this.kathigitis = kathigitis;
        this.wres = wres;
        this.eksetastikes = eksetastikes;
        this.ps=ps;
    }
    
    public Mathima(int ID, String titlos, Kathigitis kathigitis,ProgrammaSpoudwn ps) {
        this.ID = ID;
        this.titlos = titlos;
        this.kathigitis = kathigitis;
        this.ps=ps;
    }
    
    public void setDilwsi (Dilwsi dilwsi) {
        this.anikeiSe = dilwsi;
    }
    
    public String toString()  {
		return ("\nTo mathima " + ID + " anikei sth dilwsi me typiko eksamino : " 
			+ anikeiSe.getAkadimaiko_eksamino());
	}
    
    public int getID() {
        return ID;
    }

    public String getTitlos() {
        return titlos;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public int getDm() {
        return Dm;
    }

    public Kathigitis getKathigitis() {
        return kathigitis;
    }

    public int getWres() {
        return wres;
    }

    public ArrayList<Eksetastiki> getEksetastikes() {
        return eksetastikes;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }

    public void setDm(int Dm) {
        this.Dm = Dm;
    }

    public void setKathigitis(Kathigitis kathigitis) {
        this.kathigitis = kathigitis;
    }

    public void setWres(int wres) {
        this.wres = wres;
    }

    public void setEksetastikes(ArrayList<Eksetastiki> eksetastikes) {
        this.eksetastikes = eksetastikes;
    }

    public ProgrammaSpoudwn getPs() {
        return ps;
    }

    public void setPs(ProgrammaSpoudwn ps) {
        this.ps = ps;
    }
    
    

}
