package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Devices.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //Denne kodeblokken tester om brukeren er admin
    @Test
    @DisplayName("Test is a success: User with admin status ")
    public void userAdminTest(){
        User adminUserTest = new User(1, "John Doe", "admin");
        assertEquals("You have access to all the features", adminUserTest.AdminStatus());
    }



    @Test
    @DisplayName("Test is a success: User with non-admin status")
    public void userNonAdminTest(){
        User userNonAdminTest = new User(2, "Ole Nordman", "non-admin");
        assertEquals("You have limited access", userNonAdminTest.AdminStatus());

    }
}