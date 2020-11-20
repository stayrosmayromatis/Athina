package Model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Foititis extends Xristis{
    private String onoma;
    private String epwnymo;
    private String email;
    private String tel;
    private String address;
    private int typiko_eksa;
    private int Dm;
    private ArrayList<Dilwsi> dilwseis=new ArrayList<>();
    
     public Foititis(String username, String password) {
        super(username, password);
    }
    
    public Foititis(String username, String password,String onoma, String epwnymo, String email, String tel, String address, int typiko_eksa, int Dm) {
        super(username, password);
        this.onoma = onoma;
        this.epwnymo = epwnymo;
        this.email = email;
        this.tel = tel;
        this.address = address;
        this.typiko_eksa = typiko_eksa;
        this.Dm = Dm;
    }
   
    public static Foititis getFoititis(String AM) throws FileNotFoundException
    {
        try
        {
            File foitites = new File("C:\\Users\\kyriakos\\Desktop\\foitites.txt");
            Scanner fileScanner = new Scanner(foitites);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String parts[]=line.split(" ");
                if(parts[0].equalsIgnoreCase(AM))
                {    
                    parts[6]=parts[6].replace("_", " ");
                    return new Foititis(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5],parts[6],Integer.parseInt(parts[7]),Integer.parseInt(parts[8]));   
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

    public ArrayList<Dilwsi> getDilwseis() {
        return dilwseis;
    }

    public boolean addToDilwseisFoititi(Dilwsi dilwsi) {
        if(dilwsi!=null)
        {
            this.dilwseis.add(dilwsi);
            return true;
        }
        return false;
    }
    
    
}
