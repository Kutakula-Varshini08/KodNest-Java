
import java.util.Scanner;

public class CountValuesGreaterThanAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double average = (double) sum / n;
        int count = 0;

        for (int i : arr) {
            if (i > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}
