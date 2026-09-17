
import java.util.Scanner;

public class RunAStaticBlockBeforeOneObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String course = scanner.nextLine();
        Course c1 = new Course(course);
    }
}

class Course {

    static {
        System.out.println("Course class initialized");
    }

    Course(String name) {
        System.out.println("Created: " + name);
    }
}
