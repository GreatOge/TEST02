
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ogechi
 */
public class Drug {
    static String ID, Name,Dosage, quantity;

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Drug.ID = ID;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        Drug.Name = Name;
    }

    public static String getDosage() {
        return Dosage;
    }

    public static void setDosage(String Dosage) {
        Drug.Dosage = Dosage;
    }

    public static String getQuantity() {
        return quantity;
    }

    public static void setQuantity(String quantity) {
        Drug.quantity = quantity;
    }
    
    
     public static void writeFile() throws IOException 
    {
       
            BufferedWriter myBF; 
            myBF = new BufferedWriter(new FileWriter("drug.txt", true));
            myBF.newLine();
            myBF.close();
        } 

static void SaveDB(String inputName, String inputID, String inputdosage, String quantity) {
    
}
}

