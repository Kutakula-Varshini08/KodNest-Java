
import java.util.Scanner;

public class BuildAReadableStudentObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String name = scanner.next();

        Student student = new Student(id, name);
        System.out.println(student);

        scanner.close();
    }
}

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + id + " - " + name;
    }
}
