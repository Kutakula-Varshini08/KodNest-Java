
import java.util.Scanner;

class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int id = scan.nextInt();
        scan.nextLine();
        String emailId = scan.nextLine();
        double salary = scan.nextDouble();

        Employee e1 = new Employee(name, id, emailId, salary);
        e1.displayEmployeeDetails();
    }
}

class Employee {

    String name;
    int id;
    String emailId;
    double salary;

    Employee(String name, int id, String emailId, double salary) {
        this.name = name;
        this.id = id;
        this.emailId = emailId;
        this.salary = salary;

    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email ID: " + emailId);
        System.out.println("Salary: " + salary);
    }
}
