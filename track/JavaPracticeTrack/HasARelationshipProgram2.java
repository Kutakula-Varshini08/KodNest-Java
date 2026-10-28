
class HasARelationshipProgram2 {

    public static void main(String[] args) {
        Person p = new Person();
        p.h.checkHeart();
        // p = null;
        // p.h.checkHeart();
    }
}

class Heart {

    Heart() {
        System.out.println("Heart is beating");
    }

    void checkHeart() {
        System.out.println("Heart is alive");
    }

}

class Person {

    Heart h = new Heart();

    Person() {
        System.out.println("Person is created with Heart");
    }

}
