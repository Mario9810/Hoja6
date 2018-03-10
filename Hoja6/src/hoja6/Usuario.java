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
    public String ordenar(){
        ArrayList<Carta> cartasSorted = new ArrayList<>();
        ArrayList<Carta> hechizos = new ArrayList<>();
        ArrayList<Carta> monstruos = new ArrayList<>();
        ArrayList<Carta> trampas = new ArrayList<>();
        for(Carta entrada:cartas){
            if(entrada.getTipo().equals("HECHIZO")){
                hechizos.add(entrada);
            }
            else if(entrada.getTipo().equals("MONSTRUO")){
                monstruos.add(entrada);
            }
            else if(entrada.getTipo().equals("TRAMPA")){
                trampas.add(entrada);
            }
        }
        for(Carta hechizo:hechizos){
            cartasSorted.add(hechizo);
        }
        for(Carta monstruo:monstruos){
            cartasSorted.add(monstruo);
        }
        for(Carta trampa:trampas){
            cartasSorted.add(trampa);
        }
        
        String cards="";
        for(Carta carta:cartasSorted){
            cards+=carta.toStringUsuario()+"\n";
        }
        return cards;
        
    }
    
    
    
}
