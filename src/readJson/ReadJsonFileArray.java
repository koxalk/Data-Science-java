/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readJson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        try {
            JSONArray jArr = (JSONArray) parser.parse(
                    new FileReader("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/readJson/data2.json"));
            
            System.out.println(jArr);
            
        } catch (IOException | ParseException e) {
            
        }
    }
}
