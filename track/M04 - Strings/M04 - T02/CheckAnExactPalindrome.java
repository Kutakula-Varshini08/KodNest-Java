
import java.util.Scanner;

public class CheckAnExactPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        if (word.equals(sb.toString())) {
            System.out.println("Palindrome: " + true);
        } else {
            System.out.println("Palindrome: " + false);
        }
    }
}
