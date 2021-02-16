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
import java.io.PrintWriter;

/**
 *
 * @author kosta
 */
public class Writeinfile3 {

    public static void main(String args[]) {
        //using string array
        String[] newList = {"python", "c++", "java"};

        //location of file
        String location = "C://Users/kosta/Documents/NetBeansProjects/DataScience/src/writeinFile/data.txt";

        /*  the PrintWriter class, which wraps around the BufferedWriter.
            PrintWriter and has a method println() that uses the native newline character of whatever operating
            system you are on. So the \n can be excluded in the code. This has the advantage that you don’t have to
            worry about adding those pesky newline characters. This could also be useful if you are generating text
            files on your own computer (and therefore OS) and will be consuming these files yourself.*/
        try ( PrintWriter pw = new PrintWriter(new BufferedWriter(
                new FileWriter(location)))) {

            
            for(String s: newList){
                pw.append(s);
                
                pw.println();
            }

            pw.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
