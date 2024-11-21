package no.SetGruppe10.models.Devices;

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
        if(isLightOn == true){
            return "The Lights Are Off Now :)";
        }
        else {
            return "The Lights Were Aleready Off";
        }
    }

    @Override
    public String turnDeviceOn() {
        if(isLightOn == false){
            return "The Lights Are On Now";
        }
        else {
            return "The Lights Were Alerady On";
        }
    }
}
