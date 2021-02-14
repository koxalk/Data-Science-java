package Nulls;

public class TryNull {

  public static void main(String[] args) {
    String s= "kostas";
    
    boolean re= checkNull(s);
    
    if(re == false){
      System.out.println("string is not null");
    }else{
      System.out.println("string is null");
    }
    
    s= " ";
    re=checkBlack(s);
    
    if(re == false)
    {
      System.out.println("false");
    }else{
      System.out.println("true");
    }
  }
  
  /*Null values appear in a variety of forms. If the data is being passed around inside Java, it’s entirely
possible to have a null. If you are parsing strings from a text file, a null value may be represented by a
variety of the literal string "null", "NULL", or other string such as "na", or even a dot. In either case (a
null type or null literal), we want to keep track of these*/
  private static boolean checkNull(String n)
  {
    return  n == null || "null".equalsIgnoreCase(n);
  }
  
  /*
  Blank spaces abound in real data. It is straightforward to check for an empty string by using the
String.isEmpty() method. However, keep in mind that a string of blank spaces (even one blank space)
is not empty! First, we use the String.trim() method to remove any leading or trailing spaces around
the input value and then check its length. String.isEmpty() returns true only if the string has zero
length:*/
  private static boolean checkBlack(String n)
  {
    return n.trim().isEmpty();
  }

}
