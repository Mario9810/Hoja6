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
public class BuscadorCarta {
    private FactoryHash factoryhash;
    

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
    
    
    public Map<String,Carta> ordenarporTipo(Map<String,Carta> map){
        Map<String,Carta> cartasSorted = new LinkedHashMap<>();
        ArrayList<Carta> hechizos = new ArrayList<>();
        ArrayList<Carta> monstruos = new ArrayList<>();
        ArrayList<Carta> trampas = new ArrayList<>();
        for(Map.Entry<String, Carta> entrada:map.entrySet()){
            if(entrada.getValue().getTipo().equals("HECHIZO")){
                hechizos.add(entrada.getValue());
            }
            else if(entrada.getValue().getTipo().equals("MONSTRUO")){
                monstruos.add(entrada.getValue());
            }
            else if(entrada.getValue().getTipo().equals("TRAMPA")){
                trampas.add(entrada.getValue());
            }
        }
        for(Carta hechizo:hechizos){
            cartasSorted.put(hechizo.getNombre(),hechizo);
        }
        for(Carta monstruo:monstruos){
            cartasSorted.put(monstruo.getNombre(),monstruo);
        }
        for(Carta trampa:trampas){
            cartasSorted.put(trampa.getNombre(),trampa);
        }
        
        
        
        return cartasSorted;
    }
    
        
}
