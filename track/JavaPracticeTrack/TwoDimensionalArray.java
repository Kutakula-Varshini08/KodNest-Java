
import java.util.Scanner;

class TwoDimensionalArray {

    public static void main(String[] args) {
        int a[][] = new int[3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
