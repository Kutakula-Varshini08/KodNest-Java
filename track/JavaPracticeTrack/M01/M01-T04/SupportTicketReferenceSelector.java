
import java.util.Scanner;

public class SupportTicketReferenceSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket t1 = new SupportTicket();
        t1.id = scanner.nextInt();
        t1.priority = scanner.nextInt();
        t1.waitingMinutes = scanner.nextInt();

        SupportTicket t2 = new SupportTicket();
        t2.id = scanner.nextInt();
        t2.priority = scanner.nextInt();
        t2.waitingMinutes = scanner.nextInt();

        SupportTicket t3 = new SupportTicket();
        t3.id = scanner.nextInt();
        t3.priority = scanner.nextInt();
        t3.waitingMinutes = scanner.nextInt();

        SupportTicket selected = t1;

        if (t2.priority > selected.priority
                || t2.priority == selected.priority && t2.waitingMinutes > selected.waitingMinutes
                || t2.priority == selected.priority && t2.waitingMinutes == selected.waitingMinutes && t2.id < selected.id) {
            selected = t2;
        }

        if (t3.priority > selected.priority
                || t3.priority == selected.priority && t3.waitingMinutes > selected.waitingMinutes
                || t3.priority == selected.priority && t3.waitingMinutes == selected.waitingMinutes && t3.id < selected.id) {
            selected = t3;
        }

        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }
}

class SupportTicket {

    int id;
    int priority;
    int waitingMinutes;
}
