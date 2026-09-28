
import java.util.*;

public class ProtectALearnerAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        Learner l = new Learner();
        l.setAge(age);

        System.out.println(l.displayAge());
    }
}

class Learner {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int displayAge() {
        return age;
    }
}
