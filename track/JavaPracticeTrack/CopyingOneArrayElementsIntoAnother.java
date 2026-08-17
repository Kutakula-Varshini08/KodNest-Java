
import java.util.Scanner;

class CopyingOneArrayElementsIntoAnother {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array element");
        int a[] = new int[5];
        int b[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }
        int j = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            b[j] = a[i];
            j++;
        }
        System.out.println("Array element a: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array element b: ");
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
