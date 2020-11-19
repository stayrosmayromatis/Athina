package Model;

import java.util.ArrayList;

public class Kathigitis extends Xristis{
    
    private String onoma;
    private String eidikotita;
    private String email;
    private boolean digital_signature;
    private ArrayList<Mathima> mathimata=new ArrayList<>();

    public Kathigitis(String username, String password) {
        super(username, password);
    }

    public Kathigitis(String username, String password,String onoma, String eidikotita, String email, boolean digital_signature) {
        super(username, password);
        this.onoma = onoma;
        this.eidikotita = eidikotita;
        this.email = email;
        this.digital_signature = digital_signature;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEidikotita() {
        return eidikotita;
    }

    public void setEidikotita(String eidikotita) {
        this.eidikotita = eidikotita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getDigital_signature() {
        return digital_signature;
    }

    public void setDigital_signature(boolean digital_signature) {
        this.digital_signature = digital_signature;
    }

    @Override
    public String toString() {
        return "Kathigitis{" + "onoma=" + onoma + ", eidikotita=" + eidikotita + ", email=" + email + ", digital_signature=" + digital_signature + '}';
    }

    public ArrayList<Mathima> getMathimata() {
        return mathimata;
    }

    public void setMathimata(ArrayList<Mathima> mathimata) {
        this.mathimata = mathimata;
    }
  
}
