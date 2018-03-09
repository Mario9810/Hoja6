package hoja6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Principal{
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
           
            Scanner scaner = new Scanner(System.in);
            FactoryHash factory = new FactoryHash();
            Usuario usuario = new Usuario();

             System.out.println("Que tipo de mapa desea utilizar?");
             System.out.println("***1. LinkedHashMap\n***2. HashMap\n***3. TreeMap");
            
            String texto = new String();
            BufferedReader entrada;
            entrada = new BufferedReader(new FileReader("cards.txt"));

            try{
                String linea = "";
                while(entrada.ready()){
                    
                }
                System.out.println(linea);

            }catch (IOException e) {

            }finally{
                try{
                    entrada.close();
                }
                catch(IOException e1){
                }
            }
        }
}