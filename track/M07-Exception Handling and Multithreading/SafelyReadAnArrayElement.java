
import java.util.Scanner;

public class SafelyReadAnArrayElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] data = {5, 15, 25};

        try {
            System.out.println("Element: " + data[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }
}
