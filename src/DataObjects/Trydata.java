package DataObjects;

import java.util.*;


public class Trydata {

  public static void main(String[] args) {
     List<Record> listrecord = new ArrayList<>();
     
     Record record = new Record(1,2021,"Herakleion");
     
     Record record2 = new Record(2,2021,"Herakleion-alikarnassos");
     
     listrecord.add(record);
     listrecord.add(record2);
     
     for(Record r: listrecord)
     {
       System.out.println("id: " + r.getid());
       System.out.println("Date: " + r.getYear());
       System.out.println("id: " + r.getCity());
       System.out.println();
     }
     
     //hash map
     Map<String,Record> mapofrecords= new HashMap<>();
     
     mapofrecords.put("first", record);
     
     mapofrecords.put("second",new Record(2,2020,"Herakleion"));
     
     mapofrecords.put("third",new Record(3,2021,"rethimno"));
     
     System.out.println("size of map:" +mapofrecords.size());
     
     System.out.println(mapofrecords);
     
   }

}
