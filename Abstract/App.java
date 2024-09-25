abstract class Bd {

    Bd() {
        System.out.println("I am Bangladeshi constructor");
    }

    abstract public void method1();

    public void method2() {
        System.out.println("We are bangladeshi....");
    }
}

class Jamalpur extends Bd {

    public void method1() {
        System.out.println("We are Bangladeshi...from method 1");
    }

    Jamalpur() {
        super();
        System.out.println("Jamalpur...");
    }
}

public class App {
    public static void main(String[] args) {

        Jamalpur dulal = new Jamalpur();
        dulal.method2();
        dulal.method1();
    }

}