
import java.util.Scanner;

public class FindOneRepeatingAndOneMissingValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] seen = new boolean[n + 1];

        int repeating = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (seen[value]) {
                repeating = value;
            } else {
                seen[value] = true;
            }
        }

        int missing = 0;

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        System.out.println(repeating + " " + missing);
    }
}
