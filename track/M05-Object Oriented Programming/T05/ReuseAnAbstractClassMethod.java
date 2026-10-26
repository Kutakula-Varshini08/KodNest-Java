
import java.util.Scanner;

public class ReuseAnAbstractClassMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Course c = new JavaCourse(name);
        c.showCourse();
    }
}

abstract class Course {

    private String name;

    Course(String name) {
        this.name = name;
    }

    void showCourse() {
        System.out.println("Course: " + name);
    }
}

class JavaCourse extends Course {

    JavaCourse(String name) {
        super(name);
    }
}
