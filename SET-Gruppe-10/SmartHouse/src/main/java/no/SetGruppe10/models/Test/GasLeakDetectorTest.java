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
        GasLeakDetector gasLeakDeviceTurnOffTest2 = new GasLeakDetector("GasLeakDeviceTest", false, 40);
        assertEquals("Device Was Already Off", gasLeakDeviceTurnOffTest2.turnDeviceOff());
    }
    @Test
    @DisplayName("Test is a success: Carbon Monoxide detected")
    public void GasLeakDeviceSendAlert(){
        GasLeakDetector gasLeakDeviceSendAlert = new GasLeakDetector("GasLeakDeviceTest", true, 51);
        assertEquals("Carbon Monoxide Detected", gasLeakDeviceSendAlert.gasLeakDetetctedSendAlert());
    }
    @Test
    @DisplayName("Test is a success: Dangerous Levels Of Carbon Monoxide, Call the Fire departemnt ")
    public void GasLeakDeviceSendAlert2(){
        GasLeakDetector gasLeakDeviceSendAlert2 = new GasLeakDetector("GasLeakDeviceTest", true, 201);
        assertEquals("Dangerous Levels Of Carbon Monoxide, Call the Fire departemnt", gasLeakDeviceSendAlert2.gasLeakDetetctedSendAlert());
    }
    @Test
    @DisplayName("Test is a success: Life Threatening Levels of Carbon Monoxide,Call Emergency Services ")
    public void GasLeakDeviceSendAlert3(){
        GasLeakDetector gasLeakDeviceSendAlert3 = new GasLeakDetector("GasLeakDeviceTest", true, 802);
        assertEquals("Life Threatening Levels of Carbon Monoxide,Call Emergency Services", gasLeakDeviceSendAlert3.gasLeakDetetctedSendAlert());
    }
    @Test
    @DisplayName("Test is a success: Normal Levels Of Carbon Monoxide")
    public void GasLeakDeviceSendAlert4(){
        GasLeakDetector gasLeakDeviceSendAlert4 = new GasLeakDetector("GasLeakDeviceTest", true, 23);
        assertEquals("Normal Levels Of Carbon Monoxide", gasLeakDeviceSendAlert4.gasLeakDetetctedSendAlert());
    }




}