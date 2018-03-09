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
public class BuscadorCarta {
    private FactoryHash buscador;
    
    

    public BuscadorCarta(){
        
        
    }
    
    public String keyExiste(String key, Map mapa){
        Object value = mapa.get(key);
        
        if(value == null){
           value=("No existe la carta");
        }
        
        return (String) value;
    }
    
    public Carta buscarKey(String key, Map mapa){
        return (Carta) mapa.get(key);
    }
    
    public ArrayList<Carta> buscarTipo(String value, Map mapa){
        return null;
    }
    
    public String tipoExiste(String value, Map mapa){
        String valor = "";
        if (mapa.containsValue(value)){
            valor = value;
        }
        else{
            valor=("No existe este tipo de carta");
        }
        return valor;
        }
}
