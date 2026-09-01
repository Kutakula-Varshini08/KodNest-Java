
import java.util.Scanner;

class RemoveAnElementATParticularIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = s.nextInt();
        }
        int b[] = new int[n - 1];
        int index = s.nextInt();
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index; i < a.length - 1; i++) {
            b[i] = a[i + 1];

        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
