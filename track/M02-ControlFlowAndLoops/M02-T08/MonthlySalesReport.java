
import java.util.Scanner;

public class MonthlySalesReport {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int products = scan.nextInt();
        int months = scan.nextInt();
        int salesValues[][] = new int[products][months];

        for (int i = 0; i <= salesValues.length - 1; i++) {
            for (int j = 0; j <= salesValues[i].length - 1; j++) {
                salesValues[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i <= salesValues.length - 1; i++) {
            int total = 0;
            for (int j = 0; j <= salesValues[i].length - 1; j++) {
                total = total + salesValues[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
