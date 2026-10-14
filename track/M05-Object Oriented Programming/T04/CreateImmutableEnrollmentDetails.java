
import java.util.Scanner;

public class CreateImmutableEnrollmentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String course = scanner.next();

        Enrollment e = new Enrollment(id, course);
        e.getter();

        scanner.close();
    }
}

final class Enrollment {

    private final int id;
    private final String course;

    Enrollment(int id, String course) {
        this.id = id;
        this.course = course;
    }

    void getter() {
        System.out.println("Enrollment: " + id);
        System.out.println("Course: " + course);
    }
}
