
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class Hash{
    
    
    public static void mapp(String ourFilePath, String ourDataName) throws Exception {
    
        Map<String, String> cards = new HashMap<String, String>();
        BufferedReader in = new BufferedReader(new FileReader(ourFilePath));
        String line = "";

        while ((line = in.readLine()) != null) {
            String parts[] = line.split("|");

            cards.put(parts[0], parts[1]); 
            System.out.println(cards.toString());

            in.close();
        }
  }
}