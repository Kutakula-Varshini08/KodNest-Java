
import java.util.Scanner;

public class ReuseAPersonName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        Employee p = new Employee();
        p.setName(name);
        p.getName();

        scanner.close();
    }
}

class Person {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(name);
    }
}

class Employee extends Person {
}
