package no.SetGruppe10;
import no.SetGruppe10.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        User user1  = new User(23522, "Jon Doe", "admin");
        User user2 = new User(10846, "Jacob Doe", "non-admin");
        User user3 = new User(45646, "Carly Joe", "non-admin");
        User user4 = new User(32565, "Kelly bardaw", "admin");

        Oven oven1 = new Oven("Boch Oven",  true, true);

        System.out.println(user1.AdminStatus());
        System.out.println(user2.AdminStatus());
    }
}
