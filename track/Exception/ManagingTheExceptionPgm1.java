
import java.util.Scanner;

class ManagingTheExceptionPgm1 {

    public static void main(String[] args) {
        System.out.println("Main method execution started");
        divide();
        System.out.println("Main method execution completed");
    }

    static void divide() {
        try {
            System.out.println("Divide method started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);

        } catch (Exception e) {
            System.out.println("Exception handled in the divide method");
        }
        System.out.println("Division method completed");
    }
}
