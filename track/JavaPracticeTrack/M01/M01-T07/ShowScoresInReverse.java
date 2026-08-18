
import java.util.Scanner;

public class ShowScoresInReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.print("Reverse scores: ");

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }

        scanner.close();
    }
}
