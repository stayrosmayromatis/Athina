package Model;
import static Model.Kathigitis.getKathigitis;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Grammateia extends Xristis {
    private String email;
    private String aithma;
    private ArrayList<DiorthosiVathmologias> diorthoseisVathmologias =  new ArrayList<>();
    private ArrayList<Dilwsi> dilwseis =  new ArrayList<>();
    

    public Grammateia(String username, String password) {
        super(username, password);
    }

    public Grammateia(String username, String password,String email) {
        super(username, password);
        this.email = email;
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
    
    public ArrayList<DiorthosiVathmologias> getDiorthoseisVathmologias() throws FileNotFoundException,UnsupportedOperationException
    {
        
            DiorthosiVathmologias temp_dv=null;
            File aithmata = new File(".\\src\\Resources\\aithmata.txt");
            Scanner fileScanner = new Scanner(aithmata);
            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                String parts[]=line.split(" ");
                Kathigitis temp = getKathigitis(parts[1]);
                temp_dv = new DiorthosiVathmologias(parts[0], temp, Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), temp.getDigital_signature(), parts[6]);
                diorthoseisVathmologias.add(temp_dv);
            } 
            fileScanner.close();
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
    
    public  boolean createAithma(DiorthosiVathmologias dv){
        if(dv != null)
        {
            File aithma = new File(".\\src\\Resources\\aithmata.txt");
            try{
            if(!aithma.exists())
            {
                System.out.println("We had to make a new file.");
                aithma.createNewFile();
            }
                FileWriter fileWriter = new FileWriter(aithma,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(dv.getAM_Foititi()+" "+dv.getKathigitis().getUsername()+" "+dv.getMathima()+" "+dv.getPalia_Vathm()+" "+dv.getNea_Vathm()+" "+dv.getKathigitis().getDigital_signature()+" "+dv.getEksetastiki()+"\n");
                bufferedWriter.close();
            }catch(IOException e)
            {
                System.out.println("COULD NOT LOG!!");
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    
    }  
