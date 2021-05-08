package ManageData;


import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.commons.csv.*;

public class ReadFromCsv2 {
    public static void main(String args[])
    {
        try ( BufferedReader br = new BufferedReader(
                new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/ManageData/somefile.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
           // String[] s= line.split("\t");
            
            CSVParser parser= CSVParser.parse(line,CSVFormat.RFC4180);
            
            for(CSVRecord cr: parser){
                String id= cr.get(0);
                String year= cr.get(1);
                String city = cr.get(2);
                
                System.out.println(id+ " " + year + " " + city);
            }
           }
            
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}
