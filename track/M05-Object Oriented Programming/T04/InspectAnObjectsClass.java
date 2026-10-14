
import java.util.Scanner;

public class InspectAnObjectsClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        Course c = new Course(name);

        System.out.println("Class: " + c.getClass().getSimpleName());
        System.out.println("Course: " + name);

        scanner.close();
    }
}

class Course {

    String name;

    Course(String name) {
        this.name = name;
    }
}
