public class App4 {

    // constructor overloading

    String language;

    App4() {
        language = "Java";
    }

    App4(String language) {
        this.language = language;
    }

    public static void main(String[] args) {

        App4 obj = new App4();
        App4 obj1 = new App4("Java");

        System.out.println("Name: " + obj.language);
        System.out.println("Name: " + obj1.language);
    }

}
