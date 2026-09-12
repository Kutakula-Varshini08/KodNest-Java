
import java.util.Scanner;

public class ConvertBuilderIntoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}
