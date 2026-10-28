
import java.util.Scanner;

public class SchoolHasATeacher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String schoolName = scanner.nextLine();
        String teacherName = scanner.nextLine();
        Teacher t = new Teacher(teacherName);
        School s = new School(schoolName, t);
        s.showDetails();
        scanner.close();
    }
}

class Teacher {

    private String teacherName;

    Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    String getName() {
        return teacherName;
    }
}

class School {

    private String schoolName;
    private Teacher teacher;

    School(String schoolName, Teacher teacher) {
        this.schoolName = schoolName;
        this.teacher = teacher;
    }

    void showDetails() {
        System.out.println(schoolName + " has teacher " + teacher.getName());
    }
}
