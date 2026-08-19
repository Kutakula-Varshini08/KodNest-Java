
import java.util.Scanner;

class CalculateMatrixTotal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int integers[][] = new int[rows][columns];

        for (int i = 0; i <= integers.length - 1; i++) {
            for (int j = 0; j <= integers[i].length - 1; j++) {
                integers[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i <= integers.length - 1; i++) {
            int total = 0;
            for (int j = 0; j <= integers[i].length - 1; j++) {
                total = total + integers[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);
        }
    }
}
