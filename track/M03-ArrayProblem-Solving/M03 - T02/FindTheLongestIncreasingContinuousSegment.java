
import java.util.Scanner;

class FindTheLongestIncreasingContinuousSegment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(max);
    }
}
