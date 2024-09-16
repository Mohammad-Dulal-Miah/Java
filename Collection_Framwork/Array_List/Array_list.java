import java.util.ArrayList;
import java.util.Collections;

public class Array_list {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element

        list.add(56);
        list.add(36);
        list.add(51);
        list.add(89);
        list.add(1);

        System.out.println(list);

        // get elements

        int element = list.get(2);
        System.out.println(element);

        // add between element

        list.add(1, 55);

        System.out.println(list);

        // change element or set element

        list.set(0, 23);
        System.out.println(list);

        // delete element

        list.remove(5);
        System.out.println(list);

        // size

        int sze = list.size();
        System.out.println("Size: " + sze);

        // loops

        for (Integer integer : list) {
            System.out.println(integer);
        }

        // sorting

        Collections.sort(list);
        System.out.println(list);

        // finding an element
        if (list.contains(89)) {
            System.out.println("element found...");
        } else {
            System.out.println("element not found....");
        }

        // replace

        list.set(0, 24);
        System.out.println(list);

        list.ensureCapacity(10);
        System.out.println(list.size());

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);

        System.out.println("List1: " + list);
        System.out.println("List2: " + list1);

        Collections.copy(list, list1);
        System.out.println("New list: " + list);

        Collections.reverse(list);

        System.out.println("Reverse list: " + list);
    }
}