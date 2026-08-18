
import java.util.Scanner;

public class FindArrayStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int integer[] = new int[size];

        for (int i = 0; i <= integer.length - 1; i++) {
            integer[i] = scan.nextInt();
        }

        int maximum = integer[0];
        int minimum = integer[0];

        for (int i = 1; i <= integer.length - 1; i++) {
            if (integer[i] > maximum) {
                maximum = integer[i];
            } else if (integer[i] < minimum) {
                minimum = integer[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
