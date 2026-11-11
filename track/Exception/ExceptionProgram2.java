
import java.util.Scanner;

class ExceptionProgram1 {

    public static void main(String[] args) {
        System.out.println("Connection established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            //System.out.println("Exception Handled");
            System.out.println("Can not divided by zero");
        }
        System.out.println("Connection terminated");
    }
}
