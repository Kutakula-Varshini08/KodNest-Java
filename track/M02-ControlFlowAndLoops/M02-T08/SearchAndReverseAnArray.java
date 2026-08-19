
import java.util.Scanner;

public class SearchAndReverseAnArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = scan.nextInt();
        }
        boolean found = false;
        int targetValue = scan.nextInt();
        for (int i = 0; i <= array.length - 1; i++) {
            if (targetValue == array[i]) {
                System.out.println("Found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
        System.out.print("Reverse order: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        scan.close();
    }
}
