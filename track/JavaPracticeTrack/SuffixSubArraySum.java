
import java.util.Scanner;

class SuffixSubArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long suffix[] = new long[arr.length];
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        // int sum = 0;
        // for(int i = n - 1; i >= 0; i--){
        // sum += arr[i];
        // suffix[i] = sum;
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(suffix[i] + " ");
        }
        sc.close();
    }
}
