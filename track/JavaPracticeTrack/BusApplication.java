class BusApplication {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.busNumber = 101;
        bus.destination = "Bangalore";
        bus.displayDetails();
    }
}

class Bus {

    int busNumber;
    String destination;

    void displayDetails() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Destination: " + destination);
    }
}
