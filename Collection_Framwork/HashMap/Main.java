import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        // key(data type)-value(data type)
        HashMap<Integer, String> dic = new HashMap<>();

        // insertion

        dic.put(1, "Dulal");
        dic.put(2, "Dulali");
        dic.put(3, "Rahman");
        dic.put(4, "Laboni");

        System.out.println(dic);

        // search

        if(dic.containsKey(10)){
            System.out.println("key is present");
        }
        else{
            System.out.println("Key is not present");
        }


        System.out.println(dic.get(1));


        // loop

        for(Entry<Integer, String> e:dic.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        dic.remove(1);
        System.out.println(dic);
    }
}