package scheduling;

import employees.Hairdresser;

import java.util.ArrayList;
import java.util.HashMap;

public class Scheduler {
    private static HashMap<String, Hairdresser> hairdressers = new HashMap<>();

    public Scheduler() {
        Hairdresser roo = new Hairdresser("Roo");
        Hairdresser du = new Hairdresser("Du");
        roo.setDaysAvailable("Monday", "Tuesday");
        du.setDaysAvailable("Thursday");

        hairdressers.put("Roo", roo);
        hairdressers.put("Du", du);
    }

    public void bookHaircut (String hairdressersName, String day) {
        Hairdresser theHairdresser = hairdressers.get(hairdressersName);
        ArrayList<String> daysAvailable = theHairdresser.getDaysAvailable();

        if (daysAvailable.contains(day)) {
            System.out.println("Successfully booked a haircut date on " + day +". Hairdresser: " + theHairdresser.getName());
            theHairdresser.removeDay(day);
        }
        else {
            System.out.println("The hairdresser ("+ hairdressersName + ") you wanted already had a schedule on " + day);
        }
    }
}