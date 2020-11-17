package Model;

public class Grammateia extends Xristis {
    private String email;
    private String aithma;

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
    
}
