
import java.util.Scanner;

class AccessStaticAndInstanceMembers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        Learner l1 = new Learner(learnerName);

        l1.displayName();
        Learner.displayInstitute();
    }
}

class Learner {

    String name;
    static String institute = "KodNest";

    Learner(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Learner: " + name);
    }

    static void displayInstitute() {
        System.out.println("Institute: " + institute);
    }
}
