
class FinalAppliedToMethod {

    public static void main(String[] args) {
        pgm2 p2 = new pgm2();
        p2.disp1();
        p2.disp2();
    }
}

class pgm1 {

    final void disp1() {
        System.out.println("Inside pgm1 disp1");
    }

    void disp2() {
        System.out.println("Inside pgm1 disp2");
    }
}

class pgm2 extends pgm1 {

    void disp2() {
        System.out.println("Inside pgm2");
    }
}
