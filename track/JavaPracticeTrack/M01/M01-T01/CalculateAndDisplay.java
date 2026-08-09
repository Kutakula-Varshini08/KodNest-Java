
public class CalculateAndDisplay {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double solveProblems = (double) solvedProblems;
        int exactPercentages = (int) exactPercentage;
        double average = (double) solveProblems / practiceDays;
        System.out.println("Report Value: " + solveProblems);
        System.out.println("Whole Percentage: " + exactPercentages);
        System.out.println("Average Per Day: " + average);
        if (average >= 9.0) {
            System.out.println("Daily Target Reached: true");
        }
    }
}
