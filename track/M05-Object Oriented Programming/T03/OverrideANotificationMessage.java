
import java.util.Scanner;

public class OverrideANotificationMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.next();

        Notification n = new EmailNotification();
        n.send(message);
    }
}

class Notification {

    public void send(String message) {
        System.out.println("Notification " + message);
    }
}

class EmailNotification extends Notification {

    public void send(String message) {
        System.out.println("Email " + message);
    }
}
