
import java.util.Scanner;

public class HandleDivisionByZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Finished");
    }
}
