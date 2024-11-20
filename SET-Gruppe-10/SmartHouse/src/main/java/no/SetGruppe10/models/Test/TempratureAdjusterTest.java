package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Enheter.TempratureAdjuster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempratureAdjusterTest {
    @Test
    @DisplayName("Test is a success: The device is off")
    public void TempratureDeviceTurnsOffTest(){
        TempratureAdjuster tempDeviceOffTest = new TempratureAdjuster("TestDeviceTempOff", true, 23);
        assertEquals("The Temprature device is off :)", tempDeviceOffTest.turnDeviceOff());
    }

    @Test
    @DisplayName("Test is a Succsess: The Device is On")
    public void TempratureDeviceTurnsOnTest(){
        TempratureAdjuster tempDeviceOnTest = new TempratureAdjuster("TestDeviceTempOn", false, 24);
        assertEquals("The Temprature device is On :)", tempDeviceOnTest.turnDeviceOn());
    }






}