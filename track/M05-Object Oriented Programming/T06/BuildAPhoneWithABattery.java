
import java.util.Scanner;

public class BuildAPhoneWithABattery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        int percentage = scanner.nextInt();
        Phone phone = new Phone(brand, percentage);
        phone.showStatus();
        scanner.close();
    }
}

class Battery {

    private int percentage;

    Battery(int percentage) {
        this.percentage = percentage;
    }

    int getPercentage() {
        return percentage;
    }
}

class Phone {

    private String brand;
    private Battery battery;

    Phone(String brand, int percentage) {
        this.brand = brand;
        this.battery = new Battery(percentage);
    }

    void showStatus() {
        System.out.println(brand + " battery: " + battery.getPercentage() + "%");
    }
}
