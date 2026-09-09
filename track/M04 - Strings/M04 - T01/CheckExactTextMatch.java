
import java.util.Scanner;

public class CheckExactTextMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();

        boolean match = expectedText.equals(enteredText);

        System.out.println("Match: " + match);
    }
}
