/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcessObject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kosta
 */
public class TrySql {
    
    public static void main(String args[])
    {
        DataDao data=new DataDaoImpl();
        
        DataModel m=new DataModel();
        
        //add data in database
//        m.setCity("heraklion");
//        
//        m.setYear(2019);
//        
//        
//        String s= data.addData(m);
//        
//        System.out.println(s);

        //remove data by id in database
        
//        String r=data.removeData(2);
//        
//        System.out.println(r);

        //update data of player
        
//        m.setYear(2021);
//        
//        String u= data.updateData(m,3);
//        
//        System.out.println(u);

           //get data from database
           
           List<DataModel> list=new ArrayList<>();
           
           list = data.getData();
           
           for(DataModel dm: list){
               System.out.println("id: " + dm.getid());
               System.out.println("year: " + dm.getYear());
               System.out.println("location: " + dm.getCity());
               System.out.println();
           }
    }
}
