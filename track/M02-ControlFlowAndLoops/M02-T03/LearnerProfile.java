
import java.util.Scanner;

public class LearnerProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("Learner: " + fullName);
        int practiceDays = scanner.nextInt();
        int solvedProblems = 0;
        for (int i = 0; i < practiceDays; i++) {
            int dailySolvedProblems = scanner.nextInt();
            solvedProblems += dailySolvedProblems;
        }
        System.out.println("Total solved: " + solvedProblems);
        float dailyAverage = (float) solvedProblems / practiceDays;
        System.out.println("Daily average: " + dailyAverage);
        if (practiceDays > 0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
        scanner.close();
    }
}
