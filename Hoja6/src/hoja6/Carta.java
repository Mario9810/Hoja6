

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
