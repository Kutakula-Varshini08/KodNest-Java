
import java.util.Scanner;

public class WithdrawFromASimpleAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double openingBalance = scanner.nextDouble();
        double withdrawalAmount = scanner.nextDouble();

        BankAccount ba = new BankAccount(openingBalance);
        ba.withdraw(withdrawalAmount);

        System.out.println(ba.getBalance());
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
