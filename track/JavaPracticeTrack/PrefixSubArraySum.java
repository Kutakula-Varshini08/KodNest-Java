
import java.util.Scanner;

class PrefixSubArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long perfix[] = new long[arr.length];
        perfix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            perfix[i] = perfix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(perfix[i] + " ");
        }
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        // sum += arr[i];
        // perfix[i] = sum;
        // }
        sc.close();
    }
}
