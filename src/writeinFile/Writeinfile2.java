package writeinFile;

import java.io.BufferedWriter;

import java.io.FileWriter;

public class Writeinfile2 {

    public static void main(String args[]) {

        //using string array
        String[] newList = {"python", "c++", "java"};

        //location of file
        String location = "C://Users/kosta/Documents/NetBeansProjects/DataScience/src/writeinFile/data.txt";


        /* setting FileWriter append bit keeps existing data and appends new data */
        try ( BufferedWriter bw = new BufferedWriter(
                new FileWriter(location, true))) {
            
            for (String s : newList) {
                bw.write(s);
                
                bw.newLine();
            }
            
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
