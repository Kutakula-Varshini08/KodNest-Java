
import java.util.Scanner;

class CharAt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char: ");
        char c = scan.next().charAt(3);
        System.out.println(c);
    }
}
