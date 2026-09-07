
import java.util.Scanner;

public class AnswerMultipleRangeSumQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] prefix = new long[n];

        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();

            if (i == 0) {
                prefix[i] = value;
            } else {
                prefix[i] = prefix[i - 1] + value;
            }
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left == 0) {
                System.out.println(prefix[right]);
            } else {
                System.out.println(prefix[right] - prefix[left - 1]);
            }
        }
    }
}
