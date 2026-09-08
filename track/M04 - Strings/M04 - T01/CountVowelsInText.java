import java.util.Scanner;

public class CountVowelsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.toLowerCase().charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
    }
}