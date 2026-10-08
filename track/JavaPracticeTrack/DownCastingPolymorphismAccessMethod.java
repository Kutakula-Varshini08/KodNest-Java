class DownCastingPolymorphismAccessMethod{
    public static void main(String[] args){
        Child1 c = new Child1();
        accessMethod(c);
        Child2 c1 = new Child2();
        accessMethod(c1);
    }
    public static void accessMethod(Parent p){
        p.display1();
        p.display2();
        if(p instanceof Child1){
            ((Child1)p).display3();
        }else{
            ((Child2)p).display3();
        }
    }
}
class Parent{
    void display1(){
        System.out.println("Inside Parent display1");
    }
    void display2(){
        System.out.println("Inside Parent display2");
    }
}
class Child1 extends Parent{
    void display2(){
        System.out.println("Inside Child1 display2");
    }
    void display3(){
        System.out.println("Inside Child1 display3");
    }
}
class Child2 extends Parent{
    void display2(){
        System.out.println("Inside Child2 display2");
    }
    void display3(){
        System.out.println("Inside Child2 display3");
    }
}