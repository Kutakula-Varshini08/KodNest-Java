
import java.util.Scanner;

class FindTheSecondSmallestDistinctValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest != -1) {
            System.out.println(secondSmallest);
        } else {
            System.out.println("No second largest distinct value");
        }

    }
}
