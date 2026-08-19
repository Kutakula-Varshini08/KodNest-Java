
import java.util.Scanner;

public class DailyAttendanceTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        for (int i = 0; i <= attendance.length - 1; i++) {
            for (int j = 0; j <= attendance[i].length - 1; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j <= days - 1; j++) {
            int total = 0;

            for (int i = 0; i <= classes - 1; i++) {
                total = total + attendance[i][j];
            }

            System.out.println("Day " + (j + 1) + " total: " + total);
        }
    }
}
