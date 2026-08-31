
import java.util.Scanner;

public class FindTheSumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.printf("%.2f%n", average);

        scanner.close();
    }
}
