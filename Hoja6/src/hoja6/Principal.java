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
            ArrayList<Carta> cartaslista= new ArrayList<>();

             System.out.println("Que tipo de mapa desea utilizar?");
             System.out.println("***1. LinkedHashMap\n***2. HashMap\n***3. TreeMap");
            
            String op = scaner.next();
            
            while(op.equals("1") == false && op.equals("2") == false && op.equals("3") == false){
                System.out.println("Esta no es una opcion valida. Ingrese una opcion valida.");
                op=scaner.next();
            }
            
            Map cards = factory.getMap(Integer.parseInt(op));
            
            BufferedReader entrada;
           // File archivo = new File("cards.txt");
            entrada = new BufferedReader(new FileReader("cards.txt"));
               
          

            entrada = new BufferedReader(new FileReader("cards.txt"));


            try{
                while(entrada.ready()){
                    String parts[] = entrada.readLine().split("|");
                    cards.put(parts[0], parts[1]);
                    cartaslista.add(new Carta(parts[0], parts[1]));
                }

            }catch (IOException e) {
                System.out.println("No se halla el archivo.");

            }finally{
                try{
                    entrada.close();
                }
                catch(IOException e){
                }
            }
            
            Set keys = cards.entrySet();
             System.out.println("Que desea hacer?");
             System.out.println("***1. Agregar carta\n***2. Buscar una carta y mostrar su tipo\n***3. Mostrar mis cartas\n***4. Mostrar mis cartas ordenadas por tipo\n***5. Mostrar todas las cartas\n***6. Mostrar todas las cartas por tipo");
             int option=scaner.nextInt();
             switch(option){
                 case 1:
                     System.out.println("Que carta desea agregar?");
                     String key=scaner.next().toUpperCase();
                     for(Object entry: keys){
                         if(entry.equals(key)){
                             
                             Usuario.addCarta();
                         }
                        }
                     
                     
             }
                 
         }
}