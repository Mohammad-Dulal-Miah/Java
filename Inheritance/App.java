class Animal {

    // field and method of parent class
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

// inherit from animal
class Dog extends Animal {

    public void display() {
        System.out.println("My name is " + name);
    }
}

public class App {

    public static void main(String[] args) {

        Dog desi = new Dog();
        desi.name = "natro";

        desi.display();

        // super class method called

        desi.eat();
    }
}