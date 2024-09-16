public class App3 {

    String name;

    App3(String name) {
        this.name = name;

        System.out.println(name + " this is my friend.");
    }

    public static void main(String[] args) {

        // pass single value in my parameterized constructor

        App3 obj = new App3("Ismail");
        App3 obj1 = new App3("Zillur");
        App3 obj2 = new App3("Sovon");
    }
}
