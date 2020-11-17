package Model;

import java.util.ArrayList;

public class ProgrammaSpoudwn {
    private String ID;
    private String hmeromhnia_arxhs;
    private String tmhma;
    private ArrayList<Mathima> lista_mathimatwn=new ArrayList<>();

    public ProgrammaSpoudwn(String ID, String hmeromhnia_arxhs, String tmhma) {
        this.ID = ID;
        this.hmeromhnia_arxhs = hmeromhnia_arxhs;
        this.tmhma = tmhma;
    }
    
    public ArrayList<Mathima> getAllCourses()
    {
        return this.lista_mathimatwn;
    }
    
    public boolean addToPS(Mathima mathima)
    {
        if(mathima != null)
        {
            lista_mathimatwn.add(mathima);
            return true;
        }
        return false;
    }
}
