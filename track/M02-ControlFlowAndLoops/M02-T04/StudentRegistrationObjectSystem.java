
import java.util.Scanner;

public class StudentRegistrationObjectSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.registrationId = scanner.nextInt();
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.attendancePercentage = scanner.nextDouble();

        Student s2 = new Student();
        s2.registrationId = scanner.nextInt();
        scanner.nextLine();
        s2.name = scanner.nextLine();
        s2.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendancePercentage = scanner.nextDouble();

        Student selectedStudent = null;

        if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectedId == s2.registrationId) {
            selectedStudent = s2;
        }

        if (selectedStudent == null) {
            System.out.println("Student not found.");
        } else {
            selectedStudent.attendancePercentage = newAttendancePercentage;

            System.out.println("Selected Student: " + selectedStudent.name);
        }

        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");

        scanner.close();
    }
}

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}
