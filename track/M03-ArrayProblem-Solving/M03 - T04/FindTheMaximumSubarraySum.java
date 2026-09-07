
import java.util.Scanner;

public class FindTheMaximumSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long currentSum = 0;
        long bestSum = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();

            currentSum = Math.max(value, currentSum + value);
            bestSum = Math.max(bestSum, currentSum);
        }

        System.out.println(bestSum);

        sc.close();
    }
}
