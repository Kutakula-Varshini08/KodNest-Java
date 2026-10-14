
import java.util.Scanner;

public class UseFinalSafely {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code = scanner.next();

        JavaTraining j = new JavaTraining(code);
        j.showInstitute();
        j.showCourse();

        scanner.close();
    }
}

class Training {

    final void showInstitute() {
        System.out.println("KodNest");
    }
}

final class JavaTraining extends Training {

    final String courseCode;

    JavaTraining(String courseCode) {
        this.courseCode = courseCode;
    }

    void showCourse() {
        System.out.println("Course: " + courseCode);
    }
}
