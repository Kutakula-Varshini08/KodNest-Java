
class FinalAppliedToVariable {

    public static void main(String[] args) {
        pgm1 p1 = new pgm1();
        p1.display();
    }
}

class pgm1 {

    final double PI = 3.14;

    void display() {
        double PI = 34.4;
        System.out.println(PI);
        System.out.println(this.PI);

    }

}
