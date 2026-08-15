
import java.util.Scanner;

public class DefaultEmployeeRole {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        Employee e1 = new Employee(name);
        e1.displayProfile();

        scan.close();
    }
}

class Employee {

    String name;
    String role;

    Employee(String name) {
        this.name = name;
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}
