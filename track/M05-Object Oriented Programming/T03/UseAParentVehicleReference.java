
import java.util.Scanner;

public class UseAParentVehicleReference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed = scanner.nextInt();

        Vehicle v = new Car();
        v.move(speed);
    }
}

class Vehicle {

    public void move(int speed) {
        System.out.println("Vehicle " + speed);
    }
}

class Car extends Vehicle {

    public void move(int speed) {
        System.out.println("Car " + speed);
    }
}
