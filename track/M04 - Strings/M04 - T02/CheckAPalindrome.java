
import java.util.Scanner;

class CheckAPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        StringBuilder revWord = sb.reverse();
        System.out.println("Reversed: " + revWord);

        boolean res;
        if (revWord.toString().equalsIgnoreCase(word)) {
            res = true;
        } else {
            res = false;
        }

        System.out.println("Palindrome: " + res);
    }
}
