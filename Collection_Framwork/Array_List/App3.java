import java.util.ArrayList;
import java.util.Collections;

public class App3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(116);
        list.add(53);

        System.out.println("Before swap: " + list);

        /* swapping zero index value to one index value */
        Collections.swap(list, 0, 1);

        System.out.println("After swap: " + list);
    }
}
