import java.util.ArrayList;
import java.util.Collections;

public class App1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add elements

        list.add(45);
        list.add(11);
        list.add(135);
        list.add(455);
        list.add(4);

        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();

        // add elements

        list1.add(67);
        list1.add(90);
        list1.add(17);
        list1.add(99);
        list1.add(47);

        /*
         * Now, i am copy list1 to list
         */

        Collections.copy(list, list1);

        System.out.println("Copy list: " + list);
        System.out.println("second list: " + list1);
    }
}
