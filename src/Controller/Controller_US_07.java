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
/**
 *
 * @author Stavros
 */
public class Controller_US_07 {
    private Model.Grammateia grammateia;
    private Controller_US_03 con3;
    
    public Controller_US_07() {
        con3=new Controller_US_03();
        this.grammateia=con3.returnGrammateia();
    }
    
    public String[] getDiorthoseisVathmologias()
    {
        ArrayList<DiorthosiVathmologias> temp = this.grammateia.getDiorthoseisVathmologias();
        String parts[]=null;
        for (int i = 0; i < temp.size(); i++) 
        {
              parts[i] =temp.get(i).getKathigitis().getOnoma()+" "+temp.get(i).getMathima().getTitlos()+" "+temp.get(i).getAM_Foititi()+" "+temp.get(i).getPalia_Vathm()+" "+temp.get(i).getNea_Vathm();   
        }
        return parts;    
    }
    
    public boolean checkDigSig(DiorthosiVathmologias dv)
    {
        return dv.checkDigitalSign(dv);
    }
    
    public boolean SaveDiorthosiVathmologias(DiorthosiVathmologias dv)
    {
        //Saving to Database or to a File!
        return true;
    }
}
