
import java.util.Scanner;

class personalExpenseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double montlyExpenses = scanner.nextDouble();
        double rentExpenses = scanner.nextDouble();
        double foodExpenses = scanner.nextDouble();
        double travelExpenses = scanner.nextDouble();

        double totalExpenses = rentExpenses + foodExpenses + travelExpenses;
        System.out.println("Total Expenses: " + totalExpenses);

        double remainingAmount = montlyExpenses - totalExpenses;
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }
        scanner.close();
    }
}
