
import java.util.Scanner;

public class ReuseConcreteAbstractClassBehaviour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Developer d = new Developer(name);
        d.showName();
        d.showRole();

        scanner.close();
    }
}

abstract class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }

    abstract void showRole();
}

class Developer extends Employee {

    Developer(String name) {
        super(name);
    }

    @Override
    void showRole() {
        System.out.println("Role: Developer");
    }
}
