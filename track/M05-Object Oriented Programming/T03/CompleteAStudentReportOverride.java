
import java.util.Scanner;

public class CompleteAStudentReportOverride {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.next();

        Report r = new StudentReport();

        r.display(title);
    }
}

class Report {

    public void display(String title) {
        System.out.println("Report " + title);
    }
}

class StudentReport extends Report {

    public void display(String title) {
        System.out.println("Student " + title);
    }
}
