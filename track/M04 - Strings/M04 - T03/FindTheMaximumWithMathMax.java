
import java.util.Scanner;

public class FindTheMaximumWithMathMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int result = Math.max(one, two);

        System.out.println("Maximum: " + result);
    }
}
