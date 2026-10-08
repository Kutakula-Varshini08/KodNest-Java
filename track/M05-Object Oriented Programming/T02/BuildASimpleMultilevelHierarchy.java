
import java.util.Scanner;

public class BuildASimpleMultilevelHierarchy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Developer d = new Developer(name);
        scanner.close();
    }
}

class Person {

    Person(String name) {
        System.out.println("Person " + name);
    }
}

class Employee extends Person {

    Employee(String name) {
        super(name);
        System.out.println("Employee");
    }
}

class Developer extends Employee {

    Developer(String name) {
        super(name);
        System.out.println("Developer");
    }
}
