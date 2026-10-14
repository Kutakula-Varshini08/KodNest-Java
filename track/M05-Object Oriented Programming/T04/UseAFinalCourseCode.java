
import java.util.Scanner;

public class UseAFinalCourseCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        Course c = new Course(code);
        c.display();

        scanner.close();
    }
}

class Course {

    private final String courseCode;

    Course(String courseCode) {
        this.courseCode = courseCode;
    }

    void display() {
        System.out.println("Course: " + courseCode);
    }
}
