/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readJson;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author kosta
 */
public class ReadJsonFileArray {

    public static void main(String args[]) {
        JSONParser parser = new JSONParser();

        try ( FileReader reader = new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/readJson/data2.json")) {

            Object obj = parser.parse(reader);

            JSONArray jArr = (JSONArray) obj;

            System.out.println(jArr);

            jArr.forEach(o -> {
                parseArray((JSONObject) o);
            });
          
          reader.close();
        } catch (IOException | ParseException e) {

        }
    }
    
    public static void parseArray(JSONObject jo)
    {
        JSONObject object= (JSONObject) jo.get("city");
        
        int id= Integer.parseInt(object.get("id").toString());
        
        int year = Integer.parseInt(object.get("year").toString());
  
        String city = (String) object.get("city");
        
        System.out.println(id + " " + year + " " + city);
    }
}
