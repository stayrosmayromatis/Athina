/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Controller_US_06;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Stavros
 */
public class Controller_US_07 {
    private Model.Grammateia grammateia=null;
    private Controller_US_06 con6;
    private ArrayList<DiorthosiVathmologias> temp=null;
    
    public Controller_US_07() {
        con6=new Controller_US_06();
        this.grammateia=con6.returnGrammateia();
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
        /*
        Model.Kathigitis temp= Kathigitis.getKathigitis(selected[0]+"_"+selected[1]);
        Model.Mathima m_temp=null;
        for (int i = 0; i < temp.getMathimata().size(); i++) {
            if(temp.getMathimata().get(0).getTitlos().equals(selected[2]))
            {
                m_temp=temp.getMathimata().get(0);
            }
            
        }
        DiorthosiVathmologias dv = new DiorthosiVathmologias(selected[3], temp, m_temp, Double.parseDouble(selected[4]), Double.parseDouble(selected[5]), temp.getDigital_signature(), selected[6]);
        */
        return temp.get(idx).checkDigitalSign(temp.get(idx));
    }
    
    public boolean SaveDiorthosiVathmologias(int idx)
    {
        File history = new File(".\\src\\Resources\\history.txt");
            try{
            if(!history.exists())
            {
                System.out.println("We had to make a new file.");
                history.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(history,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(temp.get(idx).getAM_Foititi()+" "+temp.get(idx).getKathigitis().getUsername()+" "+temp.get(idx).getMathima()+" "+temp.get(idx).getPalia_Vathm()+" "+temp.get(idx).getNea_Vathm()+" "+temp.get(idx).getKathigitis().getDigital_signature()+" "+temp.get(idx).getEksetastiki()+"\n");
            System.out.println("Log File Written");
            bufferedWriter.close();
            return true;
            }catch(IOException e)
            {
                System.out.println("COULD NOT LOG!!");
                return false;
            }
    }
}
