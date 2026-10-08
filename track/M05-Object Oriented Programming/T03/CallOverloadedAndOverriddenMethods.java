
import java.util.Scanner;

public class CallOverloadedAndOverriddenMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        String word = scanner.next();

        Printer p = new ColorPrinter();

        p.print(integer);
        p.print(word);
    }
}

class Printer {

    public void print(int value) {
        System.out.println("Number " + value);
    }

    public void print(String value) {
        System.out.println("Text " + value);
    }
}

class ColorPrinter extends Printer {

    public void print(String value) {
        System.out.println("Color " + value);
    }
}
