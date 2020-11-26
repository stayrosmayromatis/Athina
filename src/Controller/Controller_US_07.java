/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import Controller.Controller_US_06;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
/**
 *
 * @author Stavros
 */
public class Controller_US_07 {
    private Model.Grammateia grammateia=null;
    private Controller_US_03 con3;
    private ArrayList<DiorthosiVathmologias> temp=null;
    
    public Controller_US_07() {
        con3=new Controller_US_03();
        this.grammateia=con3.returnGrammateia();
    }
    
    public String[] getDiorthoseisVathmologias() throws FileNotFoundException
    {
        temp = this.grammateia.getDiorthoseisVathmologias();
        String parts[]=new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) 
        {
              parts[i]=temp.get(i).getKathigitis().getOnoma()+" "+temp.get(i).getMathima()+" "+temp.get(i).getAM_Foititi()+" "+temp.get(i).getPalia_Vathm()+" "+temp.get(i).getNea_Vathm()+" "+temp.get(i).getEksetastiki();   
        }
        return parts;    
    }
    
    public boolean checkDigSig(int idx) throws FileNotFoundException
    {
        return temp.get(idx).checkDigitalSign(temp.get(idx));
    }
    
    public boolean SaveDiorthosiVathmologias(String selected)
    {
        File history = new File(".\\src\\Resources\\history.txt");
        File vathmologiesModified = new File(".\\src\\Resources\\vathmologies.txt");
        int idx=-1;
        //Getting the index of the selected List line in the ArrayList<Model.Diorthoseis>
        String parts[]=selected.split(" ");
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i).getAM_Foititi().equals(parts[2]))
            {
                if(temp.get(i).getMathima()==Integer.parseInt(parts[1]))
                {
                    if(temp.get(i).getPalia_Vathm()==Double.parseDouble(parts[3]))
                    {
                        if(temp.get(i).getNea_Vathm()==Double.parseDouble(parts[4]))
                        {
                            idx=i;
                        }
                    }
                }
            }
        }
        try
        {
            if(!history.exists())
            {
                System.out.println("New History Files need to be made!");
                history.createNewFile();
            }      
            FileWriter fileWriter = new FileWriter(history,true);//appending =true;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(temp.get(idx).getAM_Foititi()+" "+temp.get(idx).getKathigitis().getUsername()+" "+temp.get(idx).getMathima()+" "+temp.get(idx).getPalia_Vathm()+" "+temp.get(idx).getNea_Vathm()+" "+temp.get(idx).getKathigitis().getDigital_signature()+" "+temp.get(idx).getEksetastiki()+"\n");
            System.out.println("History File Successfully Written");
            bufferedWriter.close();
            //Getting all of vathmologies file into one big String
            String oldContent = ""; 
            BufferedReader reader = new BufferedReader(new FileReader(vathmologiesModified));
            String line = reader.readLine();
             while (line != null) 
            {
                oldContent += line+System.lineSeparator();
                line = reader.readLine();
            }
            //Replacing the Palia Vathmologia with the Nea Valid Vathmologia 
            String oldString=temp.get(idx).getAM_Foititi()+" "+temp.get(idx).getMathima()+" "+temp.get(idx).getEksetastiki()+" "+temp.get(idx).getPalia_Vathm();
            String newString=temp.get(idx).getAM_Foititi()+" "+temp.get(idx).getMathima()+" "+temp.get(idx).getEksetastiki()+" "+temp.get(idx).getNea_Vathm();
            String newContent = oldContent.replaceAll(oldString, newString);
            //Rewriting all of the file as it were
            FileWriter  writer = new FileWriter(vathmologiesModified);  
            writer.write(newContent);
            reader.close();     
            writer.close();
            return true;
            
        }
        catch(IOException e)
        {
            System.out.println("COULD NOT LOG!!");
            return false;
        }
    }
    
    public void deleteAithmata()
    {
        Path path = FileSystems.getDefault().getPath(".\\src\\Resources\\aithmata.txt");
        try {
            Files.delete(path);
            System.out.println("All pending resolved!");
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
