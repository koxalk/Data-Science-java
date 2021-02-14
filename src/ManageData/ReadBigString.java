package ManageData;

import java.io.*;

public class ReadBigString {

    public static void main(String[] args) {
        try ( BufferedReader br = new BufferedReader(
                new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/ManageData/somefile2.txt"))) {
            String line;
            int id, year, city;

            while ((line = br.readLine()) != null) {
                /* parse each line */
                id = Integer.parseInt(line.substring(0, 4));
                year = Integer.parseInt(line.substring(4, 8));
                city = Integer.parseInt(line.substring(8, 10));
                System.out.print(id);

                System.out.print(" " + year);
                System.out.print(" " + city);
                System.out.println();
            }
            
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
