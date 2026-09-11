
import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder s = new StringBuilder(text);
        StringBuilder rev = s.reverse();
        System.out.println("Reversed: " + rev);
    }
}
