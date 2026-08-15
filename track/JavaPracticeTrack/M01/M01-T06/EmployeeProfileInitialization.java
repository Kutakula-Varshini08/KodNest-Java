
import java.util.Scanner;

public class EmployeeProfileInitialization {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        String department = scan.nextLine();
        Employee e1 = new Employee(id, name, department);
        e1.displayProfile();
    }
}

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}
