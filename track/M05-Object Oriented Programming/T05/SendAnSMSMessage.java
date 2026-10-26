
import java.util.Scanner;

public class SendAnSMSMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        Message m = new SMS(number);
        m.send();

        scanner.close();
    }
}

abstract class Message {

    abstract void send();
}

class SMS extends Message {

    String number;

    SMS(String number) {
        this.number = number;
    }

    void send() {
        System.out.println("SMS sent to " + number);
    }
}
