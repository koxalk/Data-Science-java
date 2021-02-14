package ManageData;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromCsv {

    public static void main(String[] args) {
        try ( BufferedReader br = new BufferedReader(
                new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/ManageData/somefile.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");

                int id = Integer.parseInt(s[0].trim());
                int year = Integer.parseInt(s[1].trim());
                String city = s[2].trim().replace("\"", " ");
                
                System.out.println(id+ " " + year + " " + city);
            }
            
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

  }

}
