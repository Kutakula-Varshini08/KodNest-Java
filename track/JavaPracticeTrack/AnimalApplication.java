
class AnimalApplication {

    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        Tiger t1 = new Tiger();
        m1.eat();
        m1.sleep();
        t1.eat();
        t1.sleep();
    }
}

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Monkey extends Animal {

    void eat() {
        System.out.println("Monket steals and eats");
    }
}

class Tiger extends Animal {

    void eat() {
        System.out.println("Tiger hunts and eats");
    }
}
