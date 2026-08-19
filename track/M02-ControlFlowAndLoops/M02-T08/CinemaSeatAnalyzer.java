
import java.util.Scanner;

class CinemaSeatAnalyzer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int seatLayout[][] = new int[rows][columns];

        for (int i = 0; i <= seatLayout.length - 1; i++) {
            for (int j = 0; j <= seatLayout[i].length - 1; j++) {
                seatLayout[i][j] = scan.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i <= seatLayout.length - 1; i++) {
            for (int j = 0; j <= seatLayout[i].length - 1; j++) {
                if (seatLayout[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
    }
}
