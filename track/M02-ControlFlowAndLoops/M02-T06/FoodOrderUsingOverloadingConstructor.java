
import java.util.Scanner;

public class FoodOrderUsingOverloadingConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder o1 = new FoodOrder(item);
        FoodOrder o2 = new FoodOrder(item, quantity);

        o1.display();
        o2.display();
    }
}

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}
