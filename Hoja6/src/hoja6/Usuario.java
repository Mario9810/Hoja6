/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.ArrayList;

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
        cartas.add(carta);
    }
    
    public ArrayList<Carta> getCartas(){
        return cartas;
    }
    
}
