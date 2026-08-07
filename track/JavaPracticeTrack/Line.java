
import java.util.Scanner;

class Line {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Age");
        int age = scan.nextInt();
        System.out.println("Age is: " + age);

        System.out.print("Enter the Height");
        float height = scan.nextFloat();
        System.out.println("Height is: " + height);

        scan.nextLine();

        System.out.print("Enter your full naame: ");
        String fullName = scan.nextLine();
        System.out.println("Full Name is: " + fullName);

    }

}
