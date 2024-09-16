public class App2 {

    String name;

    private App2() {
        System.out.print("Constructor called ....");
        name = "DDK";
    }

    public static void main(String[] args) {

        App2 obj = new App2();
        System.out.println("Company name: " + obj.name);
    }
}
