/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Naviank
 */
public class BrandList extends ArrayList<Brand> {

    public BrandList() {
    }
    
    public boolean loadFromFile(String filename) {
        try {
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            String line = "";
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }          
            System.out.println("Data was loaded from file: " + filename + " successfully");
            return true;
        } catch (IOException e) {
            System.err.println("Error: cannot read data from file " + filename);
            System.err.println("Reason: " + e.getMessage());
            return false;
        }       
    }
    
    public boolean saveToFile(String filename) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Brand b : this) {
                pw.println(b);
            }
            pw.close();
            fw.close();
            //f.close; //Class file khong co method nay.
            System.out.println("Data was printed to file: " + filename + " successfully");
        } catch (Exception e) {
            System.err.println("Error: cannot write data to file " + filename);
            System.err.println("Reason: " + e.getMessage());
        }
        return true;
    }
    
    public int searchID(String bID) {
        int n = this.size();
        for (int i = 0; i < n; i++) {
           if (this.get(i).brandID.equals(bID)) 
               return i;
        }
        return -1;
    }  
    
    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return (Brand) mnu.ref_getChoice(this);        
    }
    
    public void listBrand() {
        int n = this.size();
        for (int i = 0; i < n; i++) {
            Brand b = this.get(i);
            System.out.println(b);
        }
    }

    public void listBrands() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addBrand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateBrand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
