
import java.util.Scanner;

public class LearningProgressCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentProgress s1 = new StudentProgress();

        s1.name = scanner.next();
        s1.completedLessons = scanner.nextInt();
        s1.totalLessons = scanner.nextInt();

        int completionPercentage = s1.completedLessons * 100 / s1.totalLessons;

        System.out.println("Student: " + s1.name);
        System.out.println("Progress: " + s1.completedLessons + "/" + s1.totalLessons);
        System.out.println("Completion: " + completionPercentage + "%");
    }
}

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}
