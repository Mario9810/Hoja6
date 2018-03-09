
public class HashMap{
	public static void getOurData(String ourFilePath, String ourDataName) throws Exception {
    Map<String, String> ourMap = new HashMap<String, String>();
    BufferedReader in = new BufferedReader(new FileReader(ourFilePath));
    String line = "";

    while ((line = in.readLine()) != null) {
        String parts[] = line.split(",", 2);

        ourMap.put(parts[1], parts[0]);
        System.out.println(ourMap.toString());
    }

    in.close();
}