package no.SetGruppe10.models.Enheter;

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.deviceAlertFunctions.DeviceOnSendAlert;

public class OvenActiveDetecter extends DeviceFoundation implements DeviceOnSendAlert {
    private Boolean isOvenOn;
    private Boolean isOvenOff;
    public OvenActiveDetecter(String deviceName, Boolean isDeviceActive, Boolean isOvenOn){
        super(deviceName, isDeviceActive);
        this.isOvenOn = isOvenOn;

    }
    @Override
    public String toString(){
        return "Name: " + deviceName + "\nActive Status: " + isDeviceActive + "\nOn: " + isOvenOn;
    }

    public Boolean getOvenOn() {
        return isOvenOn;
    }

    public void setOvenOn(Boolean ovenOn) {
        isOvenOn = ovenOn;
    }

    @Override
    public void safetyTurnOff() {
        if(isOvenOn == true){
            System.out.println("Status: Off");
        } else if (isOvenOff == true){
            System.out.println("Status: Already Off");
        }
    }
}
