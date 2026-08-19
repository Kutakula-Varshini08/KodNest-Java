
import java.util.Scanner;

public class FindTheFirstMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }

        int targetValue = scanner.nextInt();
        int index = -1;

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == targetValue) {
                index = i;
                break;
            }
        }

        System.out.println("First index: " + index);
    }
}
