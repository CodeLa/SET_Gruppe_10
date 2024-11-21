package no.SetGruppe10.models.Test;


import no.SetGruppe10.models.Devices.UserAdminInfo;

import no.SetGruppe10.models.Devices.UserAdminInfo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //Denne kodeblokken tester om brukeren er admin
    @Test
    @DisplayName("Test is a success: User with admin status ")
    public void userAdminTest(){
        UserAdminInfo adminUserTest = new UserAdminInfo(1, "John Doe", "admin");
        assertEquals("You have access to all the features", adminUserTest.AdminStatus());
    }



    @Test
    @DisplayName("Test is a success: User with non-admin status")
    public void userNonAdminTest(){
        UserAdminInfo userNonAdminTest = new UserAdminInfo(2, "Ole Nordman", "non-admin");
        assertEquals("You have limited access", userNonAdminTest.AdminStatus());

    }
}