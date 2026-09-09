
import java.util.Scanner;

public class FindAWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String word = scanner.nextLine();
        boolean res = sentence.contains(word);
        System.out.println("Found: " + res);
    }
}
