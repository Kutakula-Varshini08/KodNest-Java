
import java.util.Scanner;

public class BuildAPrefixSumArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            sum += value;

            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(sum);
        }
    }
}
