class Animal {

    // super class method
    public void display() {
        System.out.println("I am animal");
    }

}

class Dog extends Animal {

    @Override
    public void display() {
        super.display();
        System.out.println("I am dog");
    }

    public void printMessage() {
        display();
    }
}

public class App {

    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.display();
    }
}