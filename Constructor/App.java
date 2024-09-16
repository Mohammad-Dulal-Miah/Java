class Test5 {

    String name;

    Test5() {
        // constructor body with no return type
        System.out.println("Constructor called : ");
        name = "DDK";
    }
}

public class App {

    public static void main(String[] args) {

        Test5 obj = new Test5();
        System.out.println("Company name: " + obj.name);
    }
}