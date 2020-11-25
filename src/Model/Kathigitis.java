package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kathigitis extends Xristis{
    
    private String onoma;
    private String eidikotita;
    private String email;
    private boolean digital_signature;
    private ArrayList<Mathima> mathimata=new ArrayList<>();
    private ArrayList<DiorthosiVathmologias> ypovlithises_diorthwseis=new ArrayList<>();

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

    public Kathigitis(String onoma, String email, boolean digital_signature, String username, String password,ArrayList<Mathima> mathimata) {
        super(username, password);
        this.onoma = onoma;
        this.email = email;
        this.digital_signature = digital_signature;
        this.mathimata=mathimata;
    }
    
    
    
    public static Kathigitis getKathigitis(String onoma) throws FileNotFoundException
    {
        try
        {
            File kathigites = new File(".\\src\\Resources\\kathigites.txt");
            Scanner fileScanner = new Scanner(kathigites);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String parts[]=line.split(" ");
                if(parts[0].equalsIgnoreCase(onoma))
                {     
                    return new Kathigitis(parts[0], parts[1], parts[2], parts[3], parts[4], Boolean.parseBoolean(parts[5]));
                }    
            } 
            fileScanner.close();
            return null;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found!");
            e.printStackTrace();
            return null;

        }
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
    
    public ArrayList<DiorthosiVathmologias> getYpovlithises_diorthwseis() {
        return ypovlithises_diorthwseis;
    }

    public void addDiorthoshVathmologiasToKathigiti(DiorthosiVathmologias ypovlithises_diorthwseis) {
        this.ypovlithises_diorthwseis.add(ypovlithises_diorthwseis);
    }
  
}
