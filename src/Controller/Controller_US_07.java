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
import java.io.BufferedWriter;
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
    
    public boolean SaveDiorthosiVathmologias(int idx)
    {
        File history = new File(".\\src\\Resources\\history.txt");
        try
        {
            if(!history.exists())
            {
                System.out.println("Making new history file");
                history.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(history,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(temp.get(idx).getAM_Foititi()+" "+temp.get(idx).getKathigitis().getUsername()+" "+temp.get(idx).getMathima()+" "+temp.get(idx).getPalia_Vathm()+" "+temp.get(idx).getNea_Vathm()+" "+temp.get(idx).getKathigitis().getDigital_signature()+" "+temp.get(idx).getEksetastiki()+"\n");
            System.out.println("Log File Successfully Written");
            bufferedWriter.close();
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
