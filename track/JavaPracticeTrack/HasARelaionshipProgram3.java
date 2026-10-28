
class HasARelaionshipProgram3 {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger c = new Charger();
        m.hasA(c);
        m.o.checkOS();
        c.getCharger();
        m = null;
        // m.o.checkOS(); // NullPointerException
        c.getCharger();
    }
}

class OS {

    OS() {
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS is still executing");
    }
}

class Charger {

    Charger() {
        System.out.println("Charger Created");
    }

    void getCharger() {
        System.out.println("Charger can be used for charging");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile is created with OS");
    }

    void hasA(Charger c) {
        System.out.println("Charger acquired");
    }
}
