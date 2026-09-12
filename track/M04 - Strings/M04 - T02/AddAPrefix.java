
import java.util.Scanner;

public class AddAPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();
        StringBuilder sb = new StringBuilder(baseText);
        sb.insert(0, prefix + " ");
        System.out.println("Result: " + sb);
    }
}
