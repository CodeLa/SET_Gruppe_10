package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Devices.TempratureAdjuster;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempratureAdjusterTest {
    @Test
    @DisplayName("Test is a success: The device is off")
    public void TempratureDeviceTurnsOffTest(){
        TempratureAdjuster tempDeviceOffTest = new TempratureAdjuster("TestDeviceTemp", true, 23);
        assertEquals("The Temprature device is off :)", tempDeviceOffTest.turnDeviceOff());
    }
    @Test
    @DisplayName("Test is a success: The device was Already Off")
    public void TempratureDeviceTurnsOffTest2(){
        TempratureAdjuster tempDeviceOffTest2 = new TempratureAdjuster("TestDeviceTemp", false, 23);
        assertEquals("The Temprature device was already off", tempDeviceOffTest2.turnDeviceOff());
    }

    @Test
    @DisplayName("Test is a Succsess: The Device Is On")
    public void TempratureDeviceTurnsOnTest(){
        TempratureAdjuster tempDeviceOnTest = new TempratureAdjuster("TestDeviceTemp", false, 24);
        assertEquals("The Temprature device is On :)", tempDeviceOnTest.turnDeviceOn());
    }
    @Test
    @DisplayName("Test is a Succsess: The Device was Already Off")
    public void TempratureDeviceTurnsOnTest2(){
        TempratureAdjuster tempDeviceOnTest2 = new TempratureAdjuster("TestDeviceTemp", true, 24);
        assertEquals("The Temprature device was already On", tempDeviceOnTest2.turnDeviceOn());
    }


}