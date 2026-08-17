
import java.util.Scanner;

class ReverseOfAnArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
