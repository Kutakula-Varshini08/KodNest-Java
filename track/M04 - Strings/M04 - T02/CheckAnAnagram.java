
import java.util.Scanner;

public class CheckAnAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();
        boolean result;
        if (first.length() != second.length()) {
            result = false;
            System.out.println("Anagram: " + result);
            return;
        }

        StringBuilder builder = new StringBuilder(second);

        result = true;

        for (int i = 0; i < first.length(); i++) {
            String character = String.valueOf(first.charAt(i));
            int index = builder.indexOf(character);

            if (index == -1) {
                result = false;
                break;
            }

            builder.deleteCharAt(index);
        }

        System.out.println("Anagram: " + result);
    }
}
