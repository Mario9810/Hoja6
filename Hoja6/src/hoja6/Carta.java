/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

/**
 *
 * @author cooli
 */
public class Carta {
    private String nombre,tipo;
    
    public Carta(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
}
