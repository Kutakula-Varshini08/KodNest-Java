
import java.util.Scanner;

public class SearchForAGivenValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int found = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }

        System.out.println(found);

        scanner.close();
    }
}
