
import java.util.Scanner;

public class CompareTwoEmployeeReferences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();

        Employee first = new Employee(id);
        Employee alias = first;
        Employee second = new Employee(id);

        System.out.println(first == alias);
        System.out.println(second == alias);

        scanner.close();
    }
}

class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }
}
