
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeId1 = scanner.nextInt();
        scanner.nextLine();
        String employeeName1 = scanner.nextLine();
        double basicSalary1 = scanner.nextDouble();
        double bonus1 = scanner.nextDouble();

        Employee e1 = new Employee();
        e1.setEmployeeDetails(employeeId1, employeeName1, basicSalary1);
        e1.addBonus(bonus1);

        int employeeId2 = scanner.nextInt();
        scanner.nextLine();
        String employeeName2 = scanner.nextLine();
        double basicSalary2 = scanner.nextDouble();
        double bonus2 = scanner.nextDouble();
        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        Employee e2 = new Employee(employeeId2, employeeName2, basicSalary2, bonus2);
        e2.addBonus(bonusPercentage, extraReward);

        System.out.println("Employee 1");
        e1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        e2.displayEmployee();
    }
}

class Employee {

    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    Employee() {
        employeeId = 0;
        employeeName = "";
        basicSalary = 0.0;
        bonus = 0.0;
    }

    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        bonus = 0.0;
    }

    void addBonus(double bonusAmount) {
        this.bonus = bonus + bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = this.basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus = this.bonus + additionalBonus;
    }

    double calculateTotalSalary() {
        double totalSalary = basicSalary + bonus;
        return totalSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
