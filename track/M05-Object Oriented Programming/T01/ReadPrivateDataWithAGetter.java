
import java.util.Scanner;

public class ReadPrivateDataWithAGetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();

        Product p = new Product(price);

        System.out.println(p.getPrice());
    }
}

class Product {

    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
