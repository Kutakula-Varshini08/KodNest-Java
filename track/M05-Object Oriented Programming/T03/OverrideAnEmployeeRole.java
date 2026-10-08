
import java.util.Scanner;

public class OverrideAnEmployeeRole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String role = scanner.nextLine();

        Developer d = new Developer();
        d.displayRole(role);
    }
}

class Employee {

    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {

    @Override
    public void displayRole(String role) {
        System.out.println("Developer " + role);
    }
}
