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

    public Controller_US_07() {
    }
    
    public ArrayList<DiorthosiVathmologias> getDiorthoseisVathmologias(Grammateia grammateia)
    {
        return grammateia.getDiorthoseisVathmologias();
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
