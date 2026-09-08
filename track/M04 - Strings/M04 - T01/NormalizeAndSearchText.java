
import java.util.Scanner;

public class NormalizeAndSearchText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        String result = sentence.trim().toLowerCase();
        String resultKeyword = keyword.trim().toLowerCase();

        boolean finalResult = result.contains(resultKeyword);

        System.out.println("Normalized text: " + result);
        System.out.println("Contains keyword: " + finalResult);
    }
}
