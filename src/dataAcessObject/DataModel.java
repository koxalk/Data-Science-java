/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcessObject;

/**
 *
 * @author kosta
 */
public class DataModel {
    private int id;
    private int year;
    private String city;
    
    public DataModel(int id,int year,String city)
    {
      this.id= id;
      this.year=year;
      this.city=city;
    }

    DataModel() {
//        
    }
    
    public void setid(int id)
    {
      this.id= id;
    }
    
    public int getid()
    {
      return id;
    }
    
    public void setYear(int year)
    {
      this.year = year;
    }
    
    public int getYear()
    {
      return year;
    }
    
    public void setCity(String city)
    {
      this.city = city;
    }
    
    public String getCity()
    {
      return city;
    }
    
    @Override
    public String toString()
    {
      return "id: " + id + " Year: " + year 
      + " City: " + city + "]";
    }
}
