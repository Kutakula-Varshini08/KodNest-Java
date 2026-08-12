
import java.util.Scanner;

public class ObjectReference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PracticeTask pt1 = new PracticeTask();
        pt1.id = scanner.nextInt();

        PracticeTask pt2 = new PracticeTask();
        pt2.id = scanner.nextInt();

        PracticeTask pt3 = new PracticeTask();
        pt3.id = scanner.nextInt();

        int unreachableId = pt1.id;

        PracticeTask relay = pt1;
        pt1 = pt2;
        pt2 = pt3;
        relay = pt2;
        pt3 = pt1;

        System.out.println("First Reference: " + pt1.id);
        System.out.println("Second Reference: " + pt2.id);
        System.out.println("Third Reference: " + pt3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);
    }
}

class PracticeTask {

    int id;
}
