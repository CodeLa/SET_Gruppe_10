package no.SetGruppe10.models.Classes;

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.DeviceOff;
import no.SetGruppe10.models.Interfaces.DeviceOn;

public class TempratureAdjuster extends DeviceFoundation implements DeviceOn, DeviceOff {

    private int outSideTemp;
    private int insideTemp;

    public TempratureAdjuster(String deviceName, Boolean isDeviceActive, int outSideTemp, int insideTemp) {
        super(deviceName, isDeviceActive);
        this.insideTemp = insideTemp;
        this.outSideTemp = outSideTemp;
    }

    @Override
    public String toString(){
        return "Device Name: " + deviceName + "\nActicve" + isDeviceActive + "\nOutside Temp: " +
                outSideTemp + "\nInside Temp: " + insideTemp;
    }

    @Override
    public void turnDeviceOff() {

    }

    @Override
    public void turnDeviceOn() {

    }

    public int standardTemp(TempratureAdjuster tempObject){
        return (tempObject.insideTemp + tempObject.outSideTemp);
    }

    public int changeTemp(int temp){
        return 0;
    }
}
