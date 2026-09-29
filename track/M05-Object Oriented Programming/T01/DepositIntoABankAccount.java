
import java.util.Scanner;

public class DepositIntoABankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double openingBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();

        BankAccount ba = new BankAccount(openingBalance);
        ba.deposit(depositAmount);

        System.out.println(ba.getBalance());
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
