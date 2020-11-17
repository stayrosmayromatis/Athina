package Model;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Grammateia extends Xristis {
    private String email;
    private String aithma;
    private ArrayList<DiorthosiVathmologias> diorthoseisVathmologias =  new ArrayList<>();
    private ArrayList<Dilwsi> dilwseis =  new ArrayList<>();
    

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
    
    public void sendEnrollment(Foititis foititis,Dilwsi currentDilwsi)
    {
        dilwseis.add(currentDilwsi);
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\kyriakos\\Desktop\\Enrollment.txt");
            myWriter.write("AM foititi : "+ foititis.getUsername()+"\n");
            for (int i = 0; i < currentDilwsi.getEnrolledCourses().size(); i++) {
                myWriter.write(" ID: "+currentDilwsi.getEnrolledCourses().get(i).getID()+" Titlos: "+currentDilwsi.getEnrolledCourses().get(i).getTitlos()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
      }
    }
    
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
