package DataObjects;

public class Record {
    private int id;
    private int year;
    private String city;
    
    public Record(int id,int year,String city)
    {
      this.id= id;
      this.year=year;
      this.city=city;
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
