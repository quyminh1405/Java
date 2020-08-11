package customer;

import scheduling.Scheduler;

public class Customer {
    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();
        scheduler.bookHaircut("Roo", "Monday");
        scheduler.bookHaircut("Du", "Friday");
    }
}
