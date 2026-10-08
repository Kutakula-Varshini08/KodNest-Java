
import java.util.Scanner;

public class SelectARuntimeMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        String text = scanner.next();

        Message m;

        if (choice == 1) {
            m = new EmailMessage();
        } else {
            m = new SmsMessage();
        }

        m.show(text);
    }
}

class Message {

    public void show(String text) {
        System.out.println("Message " + text);
    }
}

class EmailMessage extends Message {

    public void show(String text) {
        System.out.println("Email " + text);
    }
}

class SmsMessage extends Message {

    public void show(String text) {
        System.out.println("SMS " + text);
    }
}
