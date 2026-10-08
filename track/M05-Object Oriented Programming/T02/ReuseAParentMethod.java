
import java.util.Scanner;

public class ReuseAParentMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Employee e = new Employee();

        e.setName(name);
        e.displayWelcome();
    }
}

class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayWelcome() {
        System.out.println("Welcome " + name);
    }
}

class Employee extends Person {
}
