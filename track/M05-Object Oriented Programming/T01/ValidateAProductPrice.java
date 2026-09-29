
import java.util.Scanner;

public class ValidateAProductPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        Product p = new Product();

        if (p.setPrice(price)) {
            System.out.println(p.getPrice());
        } else {
            System.out.println("Invalid price");
        }
    }
}

class Product {

    private double price;

    public boolean setPrice(double price) {
        this.price = price;
        if (price >= 0) {
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }
}
