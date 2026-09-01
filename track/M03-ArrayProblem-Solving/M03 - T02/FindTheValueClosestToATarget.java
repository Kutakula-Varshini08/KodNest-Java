
import java.util.Scanner;

class FindTheValueClosestToATarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int closest = arr[0];
        int difference;

        if (arr[0] > target) {
            difference = arr[0] - target;
        } else {
            difference = target - arr[0];
        }

        for (int i = 1; i < arr.length; i++) {

            int currentDifference;

            if (arr[i] > target) {
                currentDifference = arr[i] - target;
            } else {
                currentDifference = target - arr[i];
            }

            if (currentDifference < difference) {
                difference = currentDifference;
                closest = arr[i];
            } else if (currentDifference == difference && arr[i] < closest) {
                closest = arr[i];
            }
        }

        System.out.println(closest);
    }
}
