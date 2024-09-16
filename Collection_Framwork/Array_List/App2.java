/*Reverse a array list */

import java.util.ArrayList;
import java.util.Collections;

public class App2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // array reverse and add value

        list.add(56);
        list.add(4);
        list.add(6);
        list.add(567);
        list.add(52);

        System.out.println("Orginal list: " + list);
        Collections.reverse(list);
        System.out.println("Sorted list: " + list);

    }
}
