
import java.util.Scanner;

public class FourMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo m = new MethodDemo();

        m.sayHello();
        m.greet(name);

        int luckyNo = m.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNo);

        int sum = m.add(first, second);
        System.out.println("Sum: " + sum);
    }
}

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}
