
class AbstractionProgram {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessMethod(c1);
        accessMethod(c2);
    }

    static void accessMethod(Parent p) {
        p.disp1();
        p.disp2();
    }
}

abstract class Parent {

    abstract void disp1();

    abstract void disp2();
}

class Child1 extends Parent {

    void disp1() {
        System.out.println("Inside Child1 disp1");
    }

    void disp2() {
        System.out.println("Inside Child1 disp2");
    }
}

class Child2 extends Parent {

    void disp1() {
        System.out.println("Inside Child2 disp1");
    }

    void disp2() {
        System.out.println("Inside Child2 disp2");
    }
}
