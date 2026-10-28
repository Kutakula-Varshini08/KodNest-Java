import java.util.Scanner;
public class BuildAHouseWithARoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomName = scanner.nextLine();
        House house = new House(roomName);
        house.showRoom();
        scanner.close();
    }
}
class Room {
    private String name;
    Room(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}
class House {
    private Room room;
    House(String roomName) {
        Room r = new Room(roomName);
        this.room = r;
    }
    void showRoom() {
        System.out.println("House contains: " + room.getName());
    }
}
