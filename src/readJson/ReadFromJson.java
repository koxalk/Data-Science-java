/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readJson;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author kosta
 */
public class ReadFromJson {

    public static void main(String args[]) {
        JSONParser parser = new JSONParser();

        try ( BufferedReader br = new BufferedReader(
                new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/readJson/data.json"))) {

            String line = br.readLine();

            JSONObject jObj = (JSONObject) parser.parse(line);

            int id = Integer.parseInt(jObj.get("id").toString());
            int year = Integer.parseInt(jObj.get("year").toString());
            String city = jObj.get("city").toString();

            System.out.println(id+ " " + year + " " + city);
            
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
