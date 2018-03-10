/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author cooli
 */
public class Usuario {
    private ArrayList<Carta> cartas;
    
    public Usuario(){
        cartas=new ArrayList<Carta>();
    }
    
    public void addCarta(Carta carta){
        if(cartaExiste(carta)==true){
            carta.setCantidad((int) carta.getCantidad()+1);
        }
        else{
            cartas.add(carta);
            carta.setCantidad((int) carta.getCantidad()+1);
        }
    }
    
    public boolean cartaExiste(Carta card){
        boolean existe=false;
        for(Carta carta:cartas){
            if(carta.getNombre().equals(card.getNombre())){
                existe=true;
            }
        }
        return existe;
    }
    
    public String getCartas(){
        String cards="";
        for(Carta carta:cartas){
            cards+=carta.toStringUsuario()+"\n";
        }
        return cards;
    }
    public ArrayList<Carta> ordenar(){
         ArrayList<Carta> sorted = new ArrayList<>();
         
        return null;
    }
    
}
