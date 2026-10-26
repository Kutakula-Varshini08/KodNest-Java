import java.util.Scanner;

public class OverrideAnAnimalSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Animal a = new Dog(name);
        a.sound();

        scanner.close();
    }
}

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println(name + " says Woof");
    }
}
