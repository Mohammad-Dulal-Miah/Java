import java.util.HashMap;
import java.util.Map.Entry;

public class App {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // enter elements

        map.put("Bangladesh", 2300);
        map.put("Srilanka", 1200);
        map.put("Nepal", 1000);

        // System.out.println(map);

        // if(map.containsKey("Nepal1")){
        // System.out.println("Key is found....");
        // }
        // else{
        // System.out.println("Key is not found....");
        // }

        // System.out.println(map.get("Bangladesh"));

        // map.remove("Srilanka");

        // System.out.println(map);

        for (Entry<String, Integer> set : map.entrySet()) {
            System.out.println(set.getKey() + "=" + set.getValue());
        }
    }
}