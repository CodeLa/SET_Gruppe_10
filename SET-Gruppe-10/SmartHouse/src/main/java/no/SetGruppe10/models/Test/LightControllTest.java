package no.SetGruppe10.models.Test;

import no.SetGruppe10.models.Devices.LightControll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LightControllTest {
    @Test
    @DisplayName("Test is a success: The Lights Is Turned Off")
    public void TurnOffTheLightsTest() {
        LightControll lightsOffTest = new LightControll("LD-Ligths",true, true);
        assertEquals("The Lights Are Off Now :)", lightsOffTest.turnDeviceOff());

    }
    @Test
    @DisplayName("Test is a success: The Lights were Already Turned Off")
    public void TurnOffTheLightsTest2() {
        LightControll lightsOffTest2 = new LightControll("LD-Ligths",true, false);
        assertEquals("The Lights Were Aleready Off", lightsOffTest2.turnDeviceOff());

    }
    @Test
    @DisplayName("Test is a success: The Lights were Already Turned Off")
    public void TurnOnTheLightsTest() {
        LightControll lightsOnTest = new LightControll("LD-Ligths",true, false);
        assertEquals("The Lights Are On Now", lightsOnTest.turnDeviceOn());

    }
    @Test
    @DisplayName("Test is a success: The Lights were Already Turned Off")
    public void TurnOnTheLightsTest2() {
        LightControll lightsOnTest2 = new LightControll("LD-Ligths",true, true);
        assertEquals("The Lights Were Alerady On", lightsOnTest2.turnDeviceOn());

    }
}