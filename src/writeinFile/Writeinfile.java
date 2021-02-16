/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writeinFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kosta
 */
public class Writeinfile {

    public static void main(String args[]) {
        
        //method 1 using the method String.join(delimiter,elements
        String newString = String.join("\n", "john","anabelle");
        
        //using string array
        String[] newList = {"python","c++","java"};
        
        //location of file
        String location="C://Users/kosta/Documents/NetBeansProjects/DataScience/src/writeinFile/data.txt";
        

        //try read file
        try(BufferedWriter br = new BufferedWriter(new FileWriter(location)))
        {
            //write in file using new line after reading data
            br.append(newString);
            
            //using loop to write in file
            for(String s: newList){
                
                //write a new String to the file
                br.append(s);
                
                //add new line for next String
                br.newLine();
            }
            
            //close file
            br.close();
            
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
