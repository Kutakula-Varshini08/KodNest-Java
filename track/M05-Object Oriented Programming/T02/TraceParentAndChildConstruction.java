
import java.util.Scanner;

public class TraceParentAndChildConstruction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        Child c = new Child(value);
        scanner.close();
    }
}

class Parent {

    Parent(String value) {
        System.out.println("Parent " + value);
    }
}

class Child extends Parent {

    Child(String value) {
        super(value);
        System.out.println("Child");
    }
}
