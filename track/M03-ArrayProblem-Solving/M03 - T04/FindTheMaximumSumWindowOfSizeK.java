
import java.util.Scanner;

public class FindTheMaximumSumWindowOfSizeK {

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

        long maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);
    }
}
