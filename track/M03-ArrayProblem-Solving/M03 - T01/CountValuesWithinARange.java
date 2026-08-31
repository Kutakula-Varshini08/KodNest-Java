
import java.util.Scanner;

class CountValuesWithinARange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (lower <= arr[i] && arr[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);
    }
}
