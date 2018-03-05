/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.*;
/**
 *
 * @author cooli
 */
public class FactoryHash {
    
    public Map getMap(int i){
     switch(i){
             case 1:
                 return new LinkedHashMap();
             case 2:
                 return new HashMap();
             case 3:
                 return new TreeMap();
        }
     return null;
    }
    
}
