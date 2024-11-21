package no.SetGruppe10;
import no.SetGruppe10.models.Devices.*;

public class Main {
    public static void main(String[] args) {

        //opprettet Brukere
        User user1  = new User(23522, "Jon Doe", "admin");
        User user2 = new User(10846, "Jacob Doe", "non-admin");
        User user3 = new User(45646, "Carly Joe", "non-admin");
        User user4 = new User(32565, "Kelly bardaw", "admin");

        //oppretter en enhet for temprature
        TempratureAdjuster tempratureAdjusterUnit1 = new TempratureAdjuster("UnitTemprature",
                true, 25);
        SmartDoorController houseDoor = new SmartDoorController("UnitDoor", true, true, true);

    }
}
