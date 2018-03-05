/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cooli
 */
public class Hoja6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
        BufferedReader entrada;
        File archivo = new File("datos.txt");
        String texto = new String();
        entrada = new BufferedReader(new FileReader(archivo));
        
        try{
            String linea = "";
            while(entrada.ready()){
                linea = entrada.readLine();
                texto += linea + '\n';
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
