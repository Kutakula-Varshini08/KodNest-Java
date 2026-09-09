
import java.util.Scanner;

public class PreserveOriginalText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String finalResult = original.toLowerCase();
        System.out.println("Original: " + original);
        System.out.println("Lowercase copy: " + finalResult);
    }
}
