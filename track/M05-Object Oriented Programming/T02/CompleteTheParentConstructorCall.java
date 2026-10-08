
import java.util.Scanner;

public class CompleteTheParentConstructorCall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        SavingsAccount a = new SavingsAccount(accountNumber);
        System.out.println(a.getAccountNumber());
        scanner.close();
    }
}

class Account {

    private int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber) {
        super(accountNumber);
    }
}
