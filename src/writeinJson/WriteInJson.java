/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writeinJson;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author kosta
 */
@SuppressWarnings("unchecked")
public class WriteInJson {
    
    private static FileWriter file;
    
    public static void main(String args[])
    {
        //first object
        JSONObject objDetails = new JSONObject();
        
        objDetails.put("id","1");
        objDetails.put("firstname","kostas");
        objDetails.put("lastname","xalkiadakis");
        
        JSONObject userObject= new JSONObject();
        
        userObject.put("user", objDetails);
        
        //second user
        JSONObject objDetails2 = new JSONObject();
        
        objDetails2.put("id","2");
        objDetails2.put("firstname","nikos");
        objDetails2.put("lastname","papas");
        
        JSONObject userObject2= new JSONObject();
        
        userObject2.put("user", objDetails2);
        
        //json array
        JSONArray array=new JSONArray();
        
        //add user in list
        array.add(userObject);

        array.add(userObject2);
        
        try
        {
            file = 
                new FileWriter("C://Users/kosta/Documents/NetBeansProjects/DataScience/src/writeInJson/data.json");
            
            file.write(array.toJSONString());

                    
        }catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }finally{
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                System.out.println("error: " + e.getMessage());
            }
        }
        
        
    }
}
