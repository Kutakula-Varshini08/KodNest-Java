
import java.util.Scanner;

public class DeliveryChargeOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator dc1 = new DeliveryCalculator();

        int standardCharge = dc1.calculateCharge(distance);
        int expressCharge = dc1.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + standardCharge);
        System.out.println("Express Charge: " + expressCharge);
    }
}

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}
