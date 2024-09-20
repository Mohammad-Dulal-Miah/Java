import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // declare hash set

        HashSet<Integer> set = new HashSet<>();

        // elements enter ---> O(1)

        set.add(45);
        set.add(13);
        set.add(45);
        set.add(46);

        // System.out.println(set);

        // search elements --- O(1)

        if (set.contains(49)) {
            System.out.println("45- value is exists");
        } else {
            System.out.println("value is not exists");
        }

        // remove elements

        // set.remove(13);
        // System.out.println(set);

        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}