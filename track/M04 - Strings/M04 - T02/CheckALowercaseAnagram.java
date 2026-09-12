
import java.util.Scanner;

public class CheckALowercaseAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        boolean result;

        if (first.length() != second.length()) {
            result = false;
            System.out.println("Anagram: " + result);
            return;
        }

        StringBuilder sb = new StringBuilder(second);
        result = true;

        for (int i = 0; i < first.length(); i++) {
            String character = String.valueOf(first.charAt(i));
            int index = sb.indexOf(character);

            if (index == -1) {
                result = false;
                break;
            }

            sb.deleteCharAt(index);
        }

        System.out.println("Anagram: " + result);
    }
}
