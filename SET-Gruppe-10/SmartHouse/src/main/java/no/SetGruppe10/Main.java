package no.SetGruppe10;
import no.SetGruppe10.models.Devices.*;

public class Main {
    public static void main(String[] args) {

        //opprettet Brukere
        UserAdminInfo user1  = new UserAdminInfo(23522, "Jon Doe", "admin");
        UserAdminInfo user2 = new UserAdminInfo(10846, "Jacob Doe", "non-admin");
        UserAdminInfo user3 = new UserAdminInfo(45646, "Carly Joe", "non-admin");
        UserAdminInfo user4 = new UserAdminInfo(32565, "Kelly bardaw", "admin");

        //oppretter en enhet for temprature
        TempratureAdjuster tempratureAdjusterUnit1 = new TempratureAdjuster("UnitTemprature",
                true, 25);
        SmartDoorController houseDoor = new SmartDoorController("UnitDoor", true, true, true);

    }
}
