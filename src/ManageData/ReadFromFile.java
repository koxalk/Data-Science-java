package ManageData;

import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) {
        /*
     The general approach for reading a text file is to create a FileReader instance surrounded by a
BufferedReader that enables reading each line. Here, FileReader takes the argument of String
filename, but FileReader can also take a File object as its argument. The File object is useful when
filenames and paths are dependent on the operating system. This is the generic form for reading files line
by line with a BufferedReader*/

        try ( BufferedReader br = new BufferedReader(
                new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/ManageData/somefile.txt"))) 
        {
            String colnames = br.readLine();

            String line;

            System.out.println(colnames);

            while ((line = br.readLine()) != null) {
                System.out.println("  " + line);
            }
            
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
        /*
    
    We can do the exact same thing if the file exists somewhere remotely:
URL url = new URL("http://storage.example.com/public-data/somefile.txt");
try(BufferedReader br = new BufferedReader(
new InputStreamReader(url.openStream())) ) {
String columnNames = br.readline(); // ONLY do this if it exists
String line;
while ((line = br.readLine()) != null) {
// TODO parse each line
}
} catch (Exception e) {
System.err.println(e.getMessage()); // or log error
         */
    }

}
