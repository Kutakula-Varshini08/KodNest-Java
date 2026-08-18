import java.util.Scanner;

public class ComparePracticePlans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int[] planned = new int[days];
        int[] completed = new int[days];

        for (int i = 0; i < planned.length; i++) {
            planned[i] = scanner.nextInt();
        }

        for (int i = 0; i < completed.length; i++) {
            completed[i] = scanner.nextInt();
        }

        int completedDays = 0;

        for (int i = 0; i < days; i++) {
            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDays++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        System.out.println("Completed days: " + completedDays);

        scanner.close();
    }
}