package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Devices.OvenActiveDetecter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OvenActiveDetecterTest {
    @Test
    @DisplayName("Test is a success: The Oven is Off")
    public void OvenIsOnTurnOffTest() {
        OvenActiveDetecter ovenOffTest = new OvenActiveDetecter("OvenBoch23", true, true);
        assertEquals("The Device Is Turned Off", ovenOffTest.turnDeviceOff());

    }
    @Test
    @DisplayName("Test is a success: The Oven Was Already Off")
    public void OvenIsOnTurnOffTest2() {
        OvenActiveDetecter ovenOffTest = new OvenActiveDetecter("OvenBoch23", true, false);
        assertEquals("The Device Was Already Off", ovenOffTest.turnDeviceOff());

    }


    @Test
    @DisplayName("Test is a success: Alert sent")
    public void OvenIsOnAlertTest() {
        OvenActiveDetecter ovenIsOnAlertTest = new OvenActiveDetecter("OvenBoch24", true, true);
        assertEquals("ALERT: THE OVEN IS ON", ovenIsOnAlertTest.safetyAlert());

}
    @Test
    @DisplayName("Test is a success: The Device Was Already Off")
    public void OvenIsOnAlertTest2() {
        OvenActiveDetecter ovenIsOnAlertTest = new OvenActiveDetecter("OvenBoch24", true, false);
        assertEquals("THE OVEN WAS ALERADY OFF:)", ovenIsOnAlertTest.safetyAlert());

    }

}