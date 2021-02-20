package charts.chartjson;

import java.io.*;
import java.util.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SuppressWarnings("unchecked")
public class chartFromJson {

    public static void main(String ags[]) {
        //json parser
        JSONParser parser = new JSONParser();
        
        //store data from json file
        List<HeartRate> list = new ArrayList<>();

        //location of file
        String file = "C://Users/kosta/Documents/NetBeansProjects/DataScience/src/charts/chartjson/heartrate.json";

        //try read file
        try ( FileReader reader = new FileReader(file)) {

            //parse tje file
            Object obj = parser.parse(reader);

            //store object to json file
            JSONArray jArr = (JSONArray) obj;
            
            //store data to list
            jArr.forEach(o -> {
                parseArray((JSONObject) o, list);
            });

            //jfree pie chart
            DefaultPieDataset dataset = new DefaultPieDataset();
            
            //pu values from list of Heartrate to pie 
            list.forEach(hr -> {
                dataset.setValue(hr.getDate(),hr.getHeartRate());
            });

            //set tile to chart
            JFreeChart chart = ChartFactory.createPieChart("Heart Rate in 7 days", dataset, true, true, false);

            //create frame
            ChartFrame frame = new ChartFrame("Test", chart);
            
            //pack
            frame.pack();
            
            //make frame visible
            frame.setVisible(true);
            
            //end the program when we close the frame
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            //close file to free system
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException | ParseException e) {
            System.out.println(e);
        }
    }

    public static void parseArray(JSONObject jo, List<HeartRate> list) {
        JSONObject obj = (JSONObject) jo.get("activities-heart");

        int HeartRate = Integer.parseInt(obj.get("heartRate").toString());

        String date = (String) obj.get("dateTime");

        HeartRate hr = new HeartRate(HeartRate, date);

        list.add(hr);
    }
}
