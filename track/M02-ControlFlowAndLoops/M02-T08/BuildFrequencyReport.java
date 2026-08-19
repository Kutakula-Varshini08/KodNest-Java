
import java.util.Scanner;

public class BuildFrequencyReport {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] integers = new int[size];

        for (int i = 0; i <= integers.length - 1; i++) {
            integers[i] = scan.nextInt();
        }

        int targetValue = scan.nextInt();
        int count = 0;

        for (int i = 0; i <= integers.length - 1; i++) {
            if (targetValue == integers[i]) {
                count++;
            }
        }

        System.out.println("Frequency of " + targetValue + ": " + count);

        scan.close();
    }
}
