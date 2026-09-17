
import java.util.Scanner;

class FindTheLargerNumberWithAStaticMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int second = scanner.nextInt();

        int result = NumberUtility.larger(one, second);

        System.out.println("Larger: " + result);
    }
}

class NumberUtility {

    static int larger(int first, int second) {
        int result = Math.max(first, second);
        return result;
    }
}
