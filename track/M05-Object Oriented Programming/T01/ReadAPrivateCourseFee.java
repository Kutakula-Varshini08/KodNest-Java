
import java.util.Scanner;

public class ReadAPrivateCourseFee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fee = scanner.nextDouble();
        Course c = new Course(fee);
        System.out.println(c.getFee());
    }
}

class Course {

    private double fee;

    Course(double fee) {
        if (fee > 0) {
            this.fee = fee;
        }
    }

    public double getFee() {
        return fee;
    }
}
