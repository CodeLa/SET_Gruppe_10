package no.SetGruppe10.models.Test;
import no.SetGruppe10.models.Devices.SmartDoorController;
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
    @Test
    @DisplayName("Test is a success")
    public void SmarDoorSendAlertTest() {
        SmartDoorController testDoorOpenAlert = new SmartDoorController("FirstDoorTestClose", true, true, true);
        assertEquals("DOOR OPEN AND MOTION DETECTED", testDoorOpenAlert.deviceIsOpenAlert());

    }
    @Test
    @DisplayName("Test is a success")
    public void SmarDoorSendAlertTest2() {
        SmartDoorController testDoorOpenAlert = new SmartDoorController("FirstDoorTestClose", true, true, false);
        assertEquals("ALERT!: DOOR: OPEN",testDoorOpenAlert.deviceIsOpenAlert() );


    }
    @Test
    @DisplayName("Test is a success")
    public void SmarDoorSendAlertTest3() {
        SmartDoorController testDoorOpenAlert = new SmartDoorController("FirstDoorTestClose", true, false, true);
        assertEquals("ALERT!: MOTION DETECTED",testDoorOpenAlert.deviceIsOpenAlert() );

    }
    @Test
    @DisplayName("Test is a success")
    public void SmarDoorSendAlertTest4() {
        SmartDoorController testDoorOpenAlert = new SmartDoorController("FirstDoorTestClose", true, false, false);
        assertEquals("Home Staus: DOOR LOCKED AND NO MOTION DETECTED :)",testDoorOpenAlert.deviceIsOpenAlert() );

    }

    }