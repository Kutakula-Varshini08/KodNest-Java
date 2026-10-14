
class FinalAppliedToClass {

    public static void main(String[] args) {
        pgm1 p1 = new pgm1();
        p1.disp1();
        p1.disp2();
    }
}

final class pgm1 {

    void disp1() {
        System.out.println("Inside pgm1 disp1");
    }

    void disp2() {
        System.out.println("Inside pgm1 disp2");
    }
}
