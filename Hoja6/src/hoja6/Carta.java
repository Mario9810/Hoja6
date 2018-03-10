


import java.io.*;
import java.util.*;
/*
/**
 *
 * @author cooli
 */
public class Carta {
    private String nombre,tipo;
    private int cantidad;
    
    public Carta(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        cantidad=0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCantidad(int cant){
        this.cantidad=cant;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String toStringUsuario(){
        return "Nombre: "+nombre+"\nTipo: "+tipo+"\nCantidad: "+cantidad;
    }
    
    public String toStringMain(){
        return "Nombre: "+nombre+"\nTipo: "+tipo;
    }
}
