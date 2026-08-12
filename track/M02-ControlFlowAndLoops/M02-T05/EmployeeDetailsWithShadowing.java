
import java.util.Scanner;

public class EmployeeDetailsWithShadowing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and salary
        String fullName = scanner.nextLine();
        double salary = scanner.nextDouble();

        // Create one Employee object
        Employee e1 = new Employee();

        // Call setDetails() and displayDetails()
        e1.setDetails(fullName, salary);
        e1.displayDetails();

        scanner.close();
    }
}

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
