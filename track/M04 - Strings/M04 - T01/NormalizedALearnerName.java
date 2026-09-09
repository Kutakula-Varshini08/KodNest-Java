
import java.util.Scanner;

public class NormalizedALearnerName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Normalize and display the name.
        String result = learnerName.trim().toUpperCase();
        System.out.println("Normalized name: " + result);
    }
}
