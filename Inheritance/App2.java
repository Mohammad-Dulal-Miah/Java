class Book {

    protected String name;

    protected void displayName() {
        System.out.println("I have a name");
    }
}

class KaziBook extends Book {

    @Override
    protected void displayName() {
        System.out.println("My name is " + name);
    }
}

public class App2 {

    public static void main(String[] args) {

        KaziBook obj = new KaziBook();
        obj.name = "gojol";

        obj.displayName();
    }
}
