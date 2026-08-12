
import java.util.Scanner;

public class CreateAndDisplayObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();
        s.id = scanner.nextInt();
        scanner.nextLine();
        s.name = scanner.nextLine();
        s.course = scanner.nextLine();
        s.javaScore = scanner.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);
    }

}

class Student {

    int id;
    String name;
    String course;
    double javaScore;
}
