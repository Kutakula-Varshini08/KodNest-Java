
import java.util.Scanner;

public class CallAParentConstructorUsingSuper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();
        Car c = new Car(brand);
        System.out.println(c.getBrand());
        scanner.close();
    }
}

class Vehicle {

    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }
}
