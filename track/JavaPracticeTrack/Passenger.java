
class Passenger {

    public static void main(String[] args) {
        Conductor c1 = new Conductor();
        Money m = new Money();
        c1.collect(m);
        Ticket t = c1.give();
        System.out.println(t);
        if (t != null) {
            System.out.println("Ticket collected");
        }
    }

}

class Conductor {

    void collect(Money m) {
        System.out.println("Money is collected by the conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}

class Ticket {

}

class Money {

}
