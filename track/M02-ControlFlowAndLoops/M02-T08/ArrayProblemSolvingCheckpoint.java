
import java.util.Scanner;

public class ArrayProblemSolvingCheckpoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int array[] = new int[size];

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scan.nextInt();
        }

        int arrayTotal = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            arrayTotal = arrayTotal + array[i];
        }

        System.out.println("Array total: " + arrayTotal);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int matrix[][] = new int[rows][columns];
        int matrixTotal = 0;

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrixTotal = matrixTotal + matrix[i][j];
            }
        }

        System.out.println("Matrix total: " + matrixTotal);
    }
}
