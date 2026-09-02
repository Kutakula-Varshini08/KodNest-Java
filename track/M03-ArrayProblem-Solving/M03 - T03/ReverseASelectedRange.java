
import java.util.Scanner;

public class ReverseASelectedRange {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int left = s.nextInt();
        int right = s.nextInt();

        // Check invalid range
        if (left < 0 || right >= n || left > right) {
            System.out.print(-1);
        } else {

            // Reverse the selected range
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            // Print modified array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
