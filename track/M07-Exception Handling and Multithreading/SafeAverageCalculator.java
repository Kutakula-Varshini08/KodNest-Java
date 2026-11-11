
import java.util.Scanner;

public class SafeAverageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();

        try {
            int average = total / count;
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average");
        }
    }
}
