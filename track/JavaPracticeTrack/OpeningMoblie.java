
import java.util.Scanner;

class OpeningMoblie {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pin = s.nextInt();
        s.nextLine();
        String password = s.nextLine();
        Moblie m = new Moblie();
        Face f = new Face();
        FingerPrint fp = new FingerPrint();
        Pattern p = new Pattern();
        m.password(pin);
        m.password(password);
        m.password(p);
        m.password(f);
        m.password(fp);
    }
}

class Moblie {

    void password(int pin) {
        System.out.println("password as pin " + pin);
    }

    void password(String password) {
        System.out.println("password as letters " + password);
    }

    void password(Pattern p) {
        System.out.println("Password as Pattern");
    }

    void password(Face f) {
        System.out.println("Password as face");
    }

    void password(FingerPrint fp) {
        System.out.println("Password as FingerPrint");
    }
}

class Face {

}

class FingerPrint {

}

class Pattern {

}
