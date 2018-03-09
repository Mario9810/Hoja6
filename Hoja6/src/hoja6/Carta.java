

package hoja6;
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
    
    public Carta(String nombre, String tipo, int cantidad){
        this.nombre=nombre;
        this.tipo=tipo;
        this.cantidad=cantidad;
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
}
