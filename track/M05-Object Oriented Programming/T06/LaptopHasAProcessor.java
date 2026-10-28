
import java.util.Scanner;

public class LaptopHasAProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        String processorName = scanner.nextLine();
        Laptop laptop = new Laptop(brand, processorName);
        laptop.showDetails();
        scanner.close();
    }
}

class Processor {

    private String processorName;

    Processor(String processorName) {
        this.processorName = processorName;
    }

    String getName() {
        return processorName;
    }
}

class Laptop {

    private String brand;
    private Processor processor;

    Laptop(String brand, String processorName) {
        this.brand = brand;
        this.processor = new Processor(processorName);
    }

    void showDetails() {
        System.out.println(brand + " uses " + processor.getName());
    }
}
