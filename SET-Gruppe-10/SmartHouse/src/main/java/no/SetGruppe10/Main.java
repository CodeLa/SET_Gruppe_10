package no.SetGruppe10;
import no.SetGruppe10.models.Classes.OvenController;
import no.SetGruppe10.models.Classes.SmartDoorController;
import no.SetGruppe10.models.Classes.User;

public class Main {
    public static void main(String[] args) {


        User user1  = new User(23522, "Jon Doe", "admin");
        User user2 = new User(10846, "Jacob Doe", "non-admin");
        User user3 = new User(45646, "Carly Joe", "non-admin");
        User user4 = new User(32565, "Kelly bardaw", "admin");

        OvenController oven1 = new OvenController("Boch Oven",  true, true);
        SmartDoorController Door1 = new SmartDoorController("Door Object 1", true,
                true, true);

        System.out.println("The Door Is Open, Using The Close function");
        Door1.Close();
        System.out.println();
        System.out.println("THE Door Status:");
        Door1.deviceIsOpenAlert();
        System.out.println();

        System.out.println("Admin with access: ");
        System.out.println(user1.AdminStatus());
        System.out.println();
        System.out.println("Admin without access");
        System.out.println(user2.AdminStatus());
    }
}
