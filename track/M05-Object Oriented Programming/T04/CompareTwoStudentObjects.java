
import java.util.Scanner;

public class CompareTwoStudentObjects {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        Student s1 = new Student(firstId);
        Student s2 = new Student(secondId);

        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Student student = (Student) obj;

        if (this.id == student.id) {
            return true;
        } else {
            return false;
        }
    }
}
