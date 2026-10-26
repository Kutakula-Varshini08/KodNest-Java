
class InterfaceProgram {

    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.disp();
        Shape ref;
        ref = s;
        ref.input();
        ref.disp();
    }
}

interface Shape {

    public abstract void input();

    public abstract void disp();
}

class Square implements Shape {

    public void input() {
        System.out.println("Input");
    }

    public void disp() {
        System.out.println("Display");
    }
}
