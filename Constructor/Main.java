class Test {

    int id;
    String name;

    Test() {
        name = null;
        id = 0;
    }

    public void show() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}