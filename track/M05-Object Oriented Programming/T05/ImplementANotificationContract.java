
import java.util.Scanner;

public class ImplementANotificationContract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        EmailAlert em = new EmailAlert(message);
        em.notifyUser();
    }
}

interface Notifiable {

    void notifyUser();
}

class EmailAlert implements Notifiable {

    String message;

    EmailAlert(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Email alert: " + message);
    }
}
