
import java.util.Scanner;

public class MobileplansUsingConstructorOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        MobilePlan defaultPlan = new MobilePlan();
        MobilePlan selectedPlan = new MobilePlan(planName, price);

        defaultPlan.display();
        selectedPlan.display();

        scanner.close();
    }
}

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}
