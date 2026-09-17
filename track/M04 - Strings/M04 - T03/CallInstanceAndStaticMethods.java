
import java.util.Scanner;

public class CallInstanceAndStaticMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        Message m1 = new Message(message);

        m1.displayText();
        Message.displayCourse();
    }
}

class Message {

    String text;

    Message(String text) {
        this.text = text;
    }

    void displayText() {
        System.out.println("Message: " + text);
    }

    static void displayCourse() {
        System.out.println("Course: " + "Java");
    }
}
