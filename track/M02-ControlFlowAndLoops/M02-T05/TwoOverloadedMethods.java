
import java.util.Scanner;

public class TwoOverloadedMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        // Create one Printer object
        Printer p = new Printer();

        // Call both show() methods
        p.show(number);
        p.show(name);

        scanner.close();
    }
}

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}
