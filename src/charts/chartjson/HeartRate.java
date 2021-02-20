/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charts.chartjson;

/**
 *
 * @author kosta
 */
public class HeartRate {

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HeartRate(int heartRate, String date) {
        this.heartRate = heartRate;
        this.date = date;
    }
    
    
    public HeartRate() {
        
    }
    
    private int heartRate;
    private String date;
    
}
