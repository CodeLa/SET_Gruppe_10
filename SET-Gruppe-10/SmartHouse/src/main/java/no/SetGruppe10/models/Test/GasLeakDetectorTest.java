package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Devices.GasLeakDetector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasLeakDetectorTest {
    @Test
    @DisplayName("Test is a success: The Device Is On")
    public void GasLeakDeviceOn(){
        GasLeakDetector gasLeakDeviceTurnOnTest = new GasLeakDetector("GasLeakDeviceTest", false, 40);
        assertEquals("The Device is On Now", gasLeakDeviceTurnOnTest.turnDeviceOn());

    }
    @Test
    @DisplayName("Test is a success: The Device Was Already On")
    public void GasLeakDeviceOn2(){
        GasLeakDetector gasLeakDeviceTurnOnTest2 = new GasLeakDetector("GasLeakDeviceTest", true, 40);
        assertEquals("The Device Was Already On", gasLeakDeviceTurnOnTest2.turnDeviceOn());

    }
    @Test
    @DisplayName("Test is a success: The Device Is Off")
    public void GasLeakDeviceOffTest(){
        GasLeakDetector gasLeakDeviceTurnOffTest = new GasLeakDetector("GasLeakDeviceTest", true, 40);
        assertEquals("The Device is Off Now", gasLeakDeviceTurnOffTest.turnDeviceOff());

    }
    @Test
    @DisplayName("Test is a success: The Device Was Already Off")
    public void GasLeakDeviceOffTest2(){
        GasLeakDetector gasLeakDeviceTurnOffTest2 = new GasLeakDetector("GasLeakDeviceTest", true, 40);
        assertEquals(" Device Was Already Off ", gasLeakDeviceTurnOffTest2.turnDeviceOff());
    }


}