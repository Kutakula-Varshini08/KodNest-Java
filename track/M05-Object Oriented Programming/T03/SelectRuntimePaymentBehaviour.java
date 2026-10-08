
import java.util.Scanner;

public class SelectRuntimePaymentBehaviour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int amount = scanner.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CardPayment();
        } else {
            payment = new CashPayment();
        }

        payment.pay(amount);
    }
}

class Payment {

    public void pay(int amount) {
        System.out.println("Payment " + amount);
    }
}

class CardPayment extends Payment {

    public void pay(int amount) {
        System.out.println("Card " + amount);
    }
}

class CashPayment extends Payment {

    public void pay(int amount) {
        System.out.println("Cash " + amount);
    }
}
