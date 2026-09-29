
import java.util.Scanner;

public class AddAttendanceDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        Attendance a = new Attendance();
        a.addDays(days);
        System.out.println(a.getPresentDays());
    }
}

class Attendance {

    private int presentDays;

    public void addDays(int days) {
        if (days > 0) {
            presentDays = presentDays + days;
        }
    }

    public int getPresentDays() {
        return presentDays;
    }
}
