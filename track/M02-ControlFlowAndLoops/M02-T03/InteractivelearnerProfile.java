
import java.util.Scanner;

public class InteractivelearnerProfile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        System.out.println("Learner: " + firstName);

        int solvedProblems = scan.nextInt();
        System.out.println("Problems solved: " + solvedProblems);

        float assessment = scan.nextFloat();
        System.out.println("Assessment: " + assessment);

    }
}
