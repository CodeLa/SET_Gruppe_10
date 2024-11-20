package no.SetGruppe10.models.Enheter;

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.DeviceOff;
import no.SetGruppe10.models.Interfaces.DeviceOn;

public class LightControll extends DeviceFoundation implements DeviceOn, DeviceOff {
    private Boolean isLightOn;
    public LightControll(String deviceName, Boolean isDeviceActive, Boolean isLightOn) {
        super(deviceName, isDeviceActive);
        this.isLightOn = isLightOn;
    }

    public Boolean getLightOn() {
        return isLightOn;
    }

    public void setLightOn(Boolean lightOn) {
        isLightOn = lightOn;
    }


    @Override
    public String turnDeviceOff() {
        return "";
    }

    @Override
    public String turnDeviceOn() {
        return "";
    }
}
