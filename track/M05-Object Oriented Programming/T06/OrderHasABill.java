
import java.util.Scanner;

public class OrderHasABill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String orderNumber = scanner.nextLine();
        double total = scanner.nextDouble();
        Bill b = new Bill(total);
        Order o = new Order(orderNumber, b);
        o.showDetails();
        scanner.close();
    }
}

class Bill {

    private double total;

    Bill(double total) {
        this.total = total;
    }

    double getValue() {
        return total;
    }
}

class Order {

    private String orderNumber;
    private Bill bill;

    Order(String orderNumber, Bill bill) {
        this.orderNumber = orderNumber;
        this.bill = bill;
    }

    void showDetails() {
        System.out.println("Order " + orderNumber + " bill: " + bill.getValue());
    }
}
