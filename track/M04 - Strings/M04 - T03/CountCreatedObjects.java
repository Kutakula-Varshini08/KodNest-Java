
import java.util.Scanner;

public class CountCreatedObjects {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            new Student();
        }

        System.out.println("Created students: " + Student.count);
    }
}

class Student {

    static int count;

    Student() {
        count++;
    }
}
