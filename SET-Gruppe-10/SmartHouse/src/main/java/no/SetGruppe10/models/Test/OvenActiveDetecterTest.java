package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Enheter.OvenActiveDetecter;
import no.SetGruppe10.models.Enheter.SmartDoorController;
import org.junit.jupiter.api.Assertions;
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
    @DisplayName("Test is a success: The Oven is Off")
    public void OvenIsOnAlertTest() {
        OvenActiveDetecter ovenIsOnAlertTest = new OvenActiveDetecter("OvenBoch24", true, true);
        assertEquals("ALERT: THE OVEN IS ON", ovenIsOnAlertTest.safetyAlert());

}

}