import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList<String> color_string = new ArrayList<>();

        // add multiple color name in array list

        color_string.add("Red");
        color_string.add("white");
        color_string.add("Black");
        color_string.add("green");
        color_string.add("pink");

        // sort the collection of list

        System.out.println("Actual color: " + color_string);
        Collections.sort(color_string);
        System.out.println("Sorted color: " + color_string);
    }
}