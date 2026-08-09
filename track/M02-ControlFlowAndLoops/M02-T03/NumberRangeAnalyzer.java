
import java.util.Scanner;

public class NumberRangeAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        int evenSum = 0;
        int oddCount = 0;
        for (int i = startValue; i <= endValue; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddCount++;
            }
            System.out.println("Even sum: + evenSum");
            System.out.println("Odd count: + oddCount");
            scanner.close();
        }
    }
}
