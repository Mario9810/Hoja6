
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author cooli
 */
public class FactoryHash {
    public Map<String,Carta> getMap(int i){
     switch(i){
             case 1:
                 System.out.println("Esta utilizando LinkedHashMap");
                 return new LinkedHashMap<String, Carta>();
             case 2:
                 System.out.println("Esta utilizando HashMap");
                 return new HashMap();
             case 3:
                 System.out.println("Esta utilizando TreeMap");
                 return new TreeMap();
        }
     return null;
    }
    
}
