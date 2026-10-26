
class HasARelaionshipProgram1 {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOS();
        // m = null;
        // m.o.checkOS(); //NullPointerException
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

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile is created with OS");
    }
}
