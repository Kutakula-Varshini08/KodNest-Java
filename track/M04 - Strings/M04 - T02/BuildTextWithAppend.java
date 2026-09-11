import java.util.Scanner;

public class BuildTextWithAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        builder.append("Learner: " + learnerName + " | " + "Course: " + courseName);

        System.out.println(builder);
    }
}