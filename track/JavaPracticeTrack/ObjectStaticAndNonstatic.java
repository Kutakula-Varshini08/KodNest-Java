
class ObjectStaticANDNonstatic {

    public static void main(String[] args) {
        car.convertKMIntoMiles();
        car nano = new car();
        nano.calculateMileage();
        car bmw = new car();
        bmw.calculateMileage();
    }
}

class car {

    static void convertKMIntoMiles() {
        System.out.println("Converting KM into Miles.....");
    }

    void calculateMileage() {
        System.out.println("Calculating the mileage.....");
    }
}
