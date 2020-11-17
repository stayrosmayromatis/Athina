package Model;
import java.util.ArrayList;

public class Grammateia extends Xristis {
    private String email;
    private String aithma;
    private ArrayList<DiorthosiVathmologias> diorthoseisVathmologias =  new ArrayList<>();
    //private ArrayList<Dilwsi> dilwseis =  new ArrayList<>();
    

    public Grammateia(String username, String password) {
        super(username, password);
    }

    public Grammateia(String email, String aithma, String username, String password) {
        super(username, password);
        this.email = email;
        this.aithma = aithma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAithma() {
        return aithma;
    }

    public void setAithma(String aithma) {
        this.aithma = aithma;
    }

    @Override
    public String toString() {
        return "Grammateia{" + "email=" + email + ", aithma=" + aithma + '}';
    }
    
    public ArrayList<DiorthosiVathmologias> getDiorthoseisVathmologias()
    {
        return this.diorthoseisVathmologias;
    }
    /*
    public void sendEnrollment(Foititis foititis,Dilwsi currentDilwsi)
    {
        //Edw kataxwreis thn dhlwsh kai grafeis ousiastika se arxeio to am foititi mazi 
        //me kwdiko mathimatos kserw gw
    }
    */
    public boolean createAithma(DiorthosiVathmologias dv){
        if(dv != null)
        {
            diorthoseisVathmologias.add(dv);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    }  
