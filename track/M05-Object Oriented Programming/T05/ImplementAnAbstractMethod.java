
import java.util.Scanner;

public class ImplementAnAbstractMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();

        Vehicle v;
        v = new Bike(brand);
        v.start();

        scanner.close();
    }
}

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    String brand;

    Bike(String brand) {
        this.brand = brand;
    }

    @Override
    void start() {
        System.out.println(brand + " bike started");
    }
}
