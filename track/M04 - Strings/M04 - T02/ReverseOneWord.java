
import java.util.Scanner;

public class ReverseOneWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
