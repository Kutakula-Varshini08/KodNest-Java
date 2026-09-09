
import java.util.Scanner;

public class TraceStringChanges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String original = scanner.nextLine();

        System.out.println("Original: " + original);

        original.toUpperCase();

        System.out.println("After ignored call: " + original);

        String result = original.toUpperCase();

        System.out.println("Uppercase copy: " + result);
    }
}
