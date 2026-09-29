
import java.util.Scanner;

public class CreateAReadOnlyCourseCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        Course c = new Course(s);
        System.out.println(c.getCourseCode());
    }
}

class Course {

    private String courseCode;

    Course(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
