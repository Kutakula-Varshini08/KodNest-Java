
import java.util.Scanner;

public class InputWithConditionAndLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int practiceDays = scan.nextInt();
        int totalSolved = 0;
        int i = 1;
        while (i <= practiceDays) {
            int problemsSolved = scan.nextInt();
            totalSolved += problemsSolved;
            i++;
        }
        System.out.println("Total Sloved: " + totalSolved);
        if (totalSolved >= 20) {
            System.out.println("Status: Strong progress");
        } else if (totalSolved >= 10 && totalSolved <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }
        scan.close();
    }
}
