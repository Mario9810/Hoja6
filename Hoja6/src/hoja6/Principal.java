import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Principal{
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
              FileReader file = new FileReader("CONCATENAR.txt"); 
             try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
             
           
            }
            input.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        } 
        
	 }
	 
}