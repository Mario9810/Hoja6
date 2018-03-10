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
    
    public void todasMisCartas(Map<String,Carta> mapa){
        for(Map.Entry<String, Carta> entrada:mapa.entrySet()){
            System.out.println(entrada.getValue().toStringMain()+"\n");
        }
    }
    
    public boolean keyExiste(String key, Map mapa){
        boolean value = true;
        
        if(mapa.get(key)==null){
           value=false;
           return value;
        }
        
        return value;
    }
    
    public Carta getCartaKey(String key, Map mapa){
        return (Carta)mapa.get(key);   
    }
    
    public String buscarTipodeCarta(String key, Map mapa){
        return ((Carta)mapa.get(key)).getTipo();
    }
    
    public List<String> buscarTipo(String value, Map mapa){
        
        List<String> valueList = new ArrayList<String>(mapa.values());
       // int occurrences = Collections.frequency(valueList, value);
        
        return valueList;
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
    
    public Map<String, String> ordenarporTipo(Map map){
        List<String> mapKeys = new ArrayList<String>(map.keySet());
        List<String> mapValues = new ArrayList<String>(map.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);
        
        LinkedHashMap<String, String> sortedMap =
        new LinkedHashMap<>();
        Iterator<String> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) {
        String val = valueIt.next();
        Iterator<String> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) {
            String key = keyIt.next();
            String comp1 = (String) map.get(key);
            String comp2 = val;

            if (comp1.equals(comp2)) {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
        return sortedMap;
    }
}
