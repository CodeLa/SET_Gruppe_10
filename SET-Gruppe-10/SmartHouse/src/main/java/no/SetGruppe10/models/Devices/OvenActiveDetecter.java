package no.SetGruppe10.models.Devices;
//Denne klassen er ment for sende en varsel melding hvis ovnen er på
//Den har mulighet til å slå av ovnen(ikke på)

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.DeviceOff;
import no.SetGruppe10.models.deviceAlertFunctions.DeviceOnSendAlert;

public class OvenActiveDetecter extends DeviceFoundation implements DeviceOff,DeviceOnSendAlert {
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
    public String turnDeviceOff() {
        if(isOvenOn == true ){
            return "The Device Is Turned Off";
        }
        else {
            return "The Device Was Already Off";
        }
    }

    @Override
    public String safetyAlert() {
        if(isOvenOn == true){
            return "ALERT: THE OVEN IS ON";
        }
        else {
            return "THE OVEN WAS ALERADY OFF:)";
        }
    }
}
