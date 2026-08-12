
import java.util.Scanner;

public class StudentUtilityUsingMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        int studentId = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();

        utility.displayStudent(studentId, name);

        double passingPercentage = utility.getPassingPercentage();

        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        System.out.println("Percentage: " + percentage);

        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double average = (double) (javaScore + sqlScore) / 2.0;
        return average;
    }
}
