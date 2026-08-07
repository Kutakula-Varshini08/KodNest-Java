
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of byte");
        byte a = scan.nextByte();
        System.out.println("Byte value is: " + a);

        System.out.println("Enter the value of short");
        short b = scan.nextShort();
        System.out.println("Short value is: " + b);

        System.out.println("Enter the value of Integer");
        int c = scan.nextInt();
        System.out.println("Integer value is: " + c);

        System.out.println("Enter the value of Long");
        long d = scan.nextLong();
        System.out.println("Long value is: " + d);

        System.out.println("Enter the value if float");
        float e = scan.nextFloat();
        System.out.println("Float value is: " + e);

        System.out.println("Enter the value of double");
        double f = scan.nextDouble();
        System.out.println("Double value is: " + f);

        System.out.println("Enter the value of boolean");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean value is: " + g);

    }

}
