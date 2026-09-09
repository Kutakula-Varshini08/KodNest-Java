
import java.util.Scanner;

public class ReadCourseDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String courseName = scanner.nextLine();
        String trainerName = scanner.nextLine();

        System.out.println("Course: " + courseName);
        System.out.println("Trainer: " + trainerName);
    }
}
