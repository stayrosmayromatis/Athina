/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Stavros
 */
public class Foititis extends Xristis{
    private String onoma;
    private String epwnymo;
    private String email;
    private String tel;
    private String address;
    private int typiko_eksa;
    private int Dm;
    
     public Foititis(String username, String password) {
        super(username, password);
    }
    
    public Foititis(String onoma, String epwnymo, String email, String tel, String address, int typiko_eksa, int Dm, String username, String password) {
        super(username, password);
        this.onoma = onoma;
        this.epwnymo = epwnymo;
        this.email = email;
        this.tel = tel;
        this.address = address;
        this.typiko_eksa = typiko_eksa;
        this.Dm = Dm;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpwnymo() {
        return epwnymo;
    }

    public void setEpwnymo(String epwnymo) {
        this.epwnymo = epwnymo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTypiko_eksa() {
        return typiko_eksa;
    }

    public void setTypiko_eksa(int typiko_eksa) {
        this.typiko_eksa = typiko_eksa;
    }

    public int getDm() {
        return Dm;
    }

    public void setDm(int Dm) {
        this.Dm = Dm;
    }

    @Override
    public String toString() {
        return "Foititis{" + "onoma=" + onoma + ", epwnymo=" + epwnymo + ", email=" + email + ", tel=" + tel + ", address=" + address + ", typiko_eksa=" + typiko_eksa + ", Dm=" + Dm + '}';
    }
    
    
    
    
    
}
