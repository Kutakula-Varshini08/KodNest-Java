
class InheritanceMethods {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.disp1();
        c1.disp2();
        c1.disp3();
    }
}

class Parent {

    void disp1() {
        System.out.println("Inside parent disp1");
    }

    void disp2() {
        System.out.println("Inside parent disp2");

    }
}

class Child extends Parent {

    // Overridden Method
    @Override
    void disp2() {
        System.out.println("Inside child disp2");
    }

    // Child Specialized Method 
    void disp3() {
        System.out.println("Inside child disp3");
    }
}
