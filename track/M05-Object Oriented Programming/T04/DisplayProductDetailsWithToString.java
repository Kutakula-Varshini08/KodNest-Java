
import java.util.Scanner;

public class DisplayProductDetailsWithToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.next();

        Product p = new Product(id, name);
        System.out.println("Product: " + p);

        scanner.close();
    }
}

class Product {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
