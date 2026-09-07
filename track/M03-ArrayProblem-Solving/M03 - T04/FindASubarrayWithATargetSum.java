
import java.util.Scanner;

public class FindASubarrayWithATargetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long target = sc.nextLong();

        long sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target && left <= right) {
                System.out.println(left + " " + right);
                return;
            }
        }

        System.out.println("-1");

        sc.close();
    }
}
