package parseerrors;

import java.time.*;
import java.time.format.DateTimeParseException;


public class ParseError {

  public static void main(String[] args) 
     {
     String n= "123";
  
     try{
       double d= Double.parseDouble(n);
       
       System.out.println(d);
     }catch(NumberFormatException e){
       e.printStackTrace();
     }
     
     n="2019-08-31T23:49:05.629+08:00";
     
     try{
      OffsetDateTime odt = OffsetDateTime.parse(n);
     
      System.out.println(odt);
      
     }catch(DateTimeParseException e){
       e.printStackTrace();
     }
     
     
  }

}
