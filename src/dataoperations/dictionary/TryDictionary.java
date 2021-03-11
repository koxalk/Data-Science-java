/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataoperations.dictionary;

import java.util.Enumeration;

/**
 *
 * @author kosta
 */
public class TryDictionary {
    
    public static void main(String args[]){
        TermDictionary dic= new TermDictionary();
        
        String[] values={"kostas","anna","panos"};
        
        dic.addTerms(values);
        dic.addTerm("john");
        
        Integer keys= dic.getTermIndex("panos");
        
        System.out.println(keys);
        System.out.println(dic.getNumTerms());
    }
}
