package no.SetGruppe10.models.Devices;
//Denne gir deg muligheten å slå av/på enheten
//Gir brukeren muligheten å velge tempratur
/*/
  For videreutvikling av enheten er det mulig å automatisere basert på tempraturen ute(årstid)
 */

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.DeviceOff;
import no.SetGruppe10.models.Interfaces.DeviceOn;

public class TempratureAdjuster extends DeviceFoundation implements DeviceOn, DeviceOff {

    private int outSideTemp;


    public TempratureAdjuster(String deviceName, Boolean isDeviceActive, int outSideTemp) {
        super(deviceName, isDeviceActive);
        this.outSideTemp = outSideTemp;
    }

    public int getOutSideTemp() {
        return outSideTemp;
    }

    public void setOutSideTemp(int outSideTemp) {
        this.outSideTemp = outSideTemp;
    }

    @Override
    public String toString(){
        return "Device Name: " + getDeviceName() + "\nActicve: " + isDeviceActive + "\nOutside Temp: " +
                outSideTemp;
    }

    @Override
    public String turnDeviceOff() {
        if(isDeviceActive == true){
            return "The Temprature device is off :)";
        }
        else {
            return "The Temprature device was already off";
        }

    }

    @Override
    public String turnDeviceOn() {
        if(isDeviceActive == false){
            return  "The Temprature device is On :)";
        }
        else {
            return "The Temprature device was already On";
        }


    }
    public String ChooseTemprature(Double temprature){
        return "You set the Temprature to " + temprature + "";
    }



}
