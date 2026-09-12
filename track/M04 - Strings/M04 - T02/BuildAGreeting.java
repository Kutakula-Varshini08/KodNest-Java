
import java.util.Scanner;

public class BuildAGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(learnerName);
        System.out.println("Hello, " + sb + "!");
    }
}
