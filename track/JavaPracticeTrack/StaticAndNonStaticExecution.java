
class StaticAndNonStaticExecution {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}

class Demo {

    static {
        System.out.println("Static Method1");
    }

    static {
        System.out.println("Static Method2");
    }

    static {
        System.out.println("Static Method3");
    }

    {
        System.out.println("Non Static Method1");
    }

    {
        System.out.println("Non Static Method2");
    }

    {
        System.out.println("Non Static Method3");
    }

}
