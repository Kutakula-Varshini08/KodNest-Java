
import java.util.Scanner;

public class FoodOrderTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        OrderCalculator c1 = new OrderCalculator();

        int res1 = c1.calculateSubtotal(price, quantity);
        int res2 = c1.calculateFinalTotal(res1, deliveryCharge);

        System.out.println("Subtotal: " + res1);
        System.out.println("Final Total: " + res2);
    }
}

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        int total = price * quantity;
        return total;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}
