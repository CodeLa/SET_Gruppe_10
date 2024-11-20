package no.SetGruppe10.models.Test;
import no.SetGruppe10.models.Enheter.SmartDoorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartDoorControllerTest {

    @Test
    @DisplayName("Test is a success: The Door Opens")
    public void SmarDoorOpenTest(){
        SmartDoorController testDoorOpen = new SmartDoorController("FirstDoorTestOpen", true, false, true);
        assertEquals("The Door Is Open Now", testDoorOpen.open());

    }
    @Test
    @DisplayName("Test is a success: The Door Closes")
    public void SmarDoorCloseTest() {
        SmartDoorController testDoorClose = new SmartDoorController("FirstDoorTestClose", true, true, true);
        assertEquals("The Door is Closed", testDoorClose.Close());


    }

    }