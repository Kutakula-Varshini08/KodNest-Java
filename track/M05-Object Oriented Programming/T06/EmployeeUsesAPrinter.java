
import java.util.Scanner;

public class EmployeeUsesAPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.nextLine();
        String document = scanner.nextLine();
        Printer printer = new Printer();
        Employee employee = new Employee(employeeName);
        employee.printDocument(printer, document);
    }
}

class Printer {

    void print(String employee, String document) {
        System.out.println(employee + " prints " + document);
    }
}

class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    void printDocument(Printer printer, String document) {
        printer.print(name, document);
    }
}
