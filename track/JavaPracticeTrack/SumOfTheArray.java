
import java.util.Scanner;

class SumOfTheArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
