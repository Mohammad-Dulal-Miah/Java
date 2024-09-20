class Car {

    public void color() {
        System.out.println("I have a lot of color");
    }
}

class Audi extends Car {

    @Override
    public void color() {
        System.out.println("I have brand color black...");
    }

    public void speed() {
        System.out.println("I have top speed 140 km/h");
    }
}

public class App1 {

    public static void main(String[] args) {

        Audi brand1 = new Audi();
        brand1.color();
        brand1.speed();
    }
}
