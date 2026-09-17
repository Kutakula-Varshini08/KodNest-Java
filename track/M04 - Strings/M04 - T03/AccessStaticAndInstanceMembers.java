
import java.util.Scanner;

class AccessStaticAndInstanceMembers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String institute = scanner.nextLine();
        String learner1 = scanner.nextLine();
        String learner2 = scanner.nextLine();

        Learner.instituteName = institute;

        Learner l1 = new Learner(learner1);
        l1.display();

        Learner l2 = new Learner(learner2);
        l2.display();
    }
}

class Learner {

    String learnerName;
    static String instituteName;

    Learner(String learnerName) {
        this.learnerName = learnerName;
    }

    void display() {
        System.out.println(learnerName + " - " + instituteName);
    }
}
