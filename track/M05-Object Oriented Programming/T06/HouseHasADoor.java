
import java.util.Scanner;

public class HouseHasADoor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String material = scanner.nextLine();
        House h = new House(material);
        h.showDoor();
    }
}

class Door {

    private String material;

    Door(String material) {
        this.material = material;
    }

    String getMaterial() {
        return material;
    }
}

class House {

    private Door door;

    House(String material) {
        door = new Door(material);
    }

    void showDoor() {
        System.out.println("House has a " + door.getMaterial() + " door");
    }
}
