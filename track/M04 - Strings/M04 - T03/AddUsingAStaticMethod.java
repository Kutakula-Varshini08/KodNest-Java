
import java.util.Scanner;

public class AddUsingAStaticMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        int result = Calculator.add(one, two);

        System.out.println("Sum: " + result);
    }
}

class Calculator {

    static int add(int first, int second) {
        int add = first + second;
        return add;
    }
}
