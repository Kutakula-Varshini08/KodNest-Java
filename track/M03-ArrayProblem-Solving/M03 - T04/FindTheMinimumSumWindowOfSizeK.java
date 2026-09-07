
import java.util.Scanner;

public class FindTheMinimumSumWindowOfSizeK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int k = sc.nextInt();

        long windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        long minSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum < minSum) {
                minSum = windowSum;
            }
        }

        System.out.println(minSum);
    }
}
