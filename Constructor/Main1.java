class Test1 {

    int id;
    String name;

    Test1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Name: " + name + " Id: " + id);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Test1 t = new Test1(12, "Dulal");
        t.showInfo();
    }
}
