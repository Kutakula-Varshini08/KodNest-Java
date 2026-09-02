
import java.util.Scanner;

public class SeparateEvenAndOddValues {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            while ((i < j) && arr[i] % 2 == 0) {
                i++;
            }

            while ((i < j) && arr[j] % 2 != 0) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
