
import java.util.Scanner;

public class AnalyzeRuntimeData {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] values = new int[5];

        for (int i = 0; i <= values.length - 1; i++) {
            values[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i <= values.length - 1; i++) {
            sum = sum + values[i];
        }

        System.out.println("Total: " + sum);
    }
}
