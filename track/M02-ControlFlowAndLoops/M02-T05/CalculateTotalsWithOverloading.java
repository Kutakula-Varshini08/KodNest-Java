
import java.util.Scanner;

public class CalculateTotalsWithOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        ResultCalculator c1 = new ResultCalculator();

        System.out.println("Two-Mark Total: " + c1.getTotal(first, second));
        System.out.println("Three-Mark Total: " + c1.getTotal(first, second, third));

        scanner.close();
    }
}

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}
