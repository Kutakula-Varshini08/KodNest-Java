
import java.util.Scanner;

public class AccessADogMethodSafely {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.next();

        Animal a = new Dog();

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.fetch(item);
        }
    }
}

class Animal {

}

class Dog extends Animal {

    public void fetch(String item) {
        System.out.println("Fetch " + item);
    }
}
