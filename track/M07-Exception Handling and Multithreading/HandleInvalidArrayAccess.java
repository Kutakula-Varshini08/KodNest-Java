
import java.util.Scanner;

public class HandleInvalidArrayAccess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] values = {10, 20, 30, 40};

        try {
            System.out.println("Value: " + values[index]);
        } catch (Exception e) {
            System.out.println("Invalid index");
        }

        System.out.println("Access finished");
    }
}
