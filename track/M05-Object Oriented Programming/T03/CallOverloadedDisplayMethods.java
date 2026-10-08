
import java.util.Scanner;

public class CallOverloadedDisplayMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String text = scanner.next();

        Display d = new Display();

        d.show(number);
        d.show(text);
    }
}

class Display {

    public void show(int value) {
        System.out.println("Number " + value);
    }

    public void show(String value) {
        System.out.println("Text " + value);
    }
}
