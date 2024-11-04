package no.SetGruppe10.models;

import no.SetGruppe10.models.deviceAlertFunctions.DeviceOpenSendAlert;

public class SmartDoorController extends DeviceFoundation implements Open, Close, DeviceOpenSendAlert {
    private Boolean isDoorOpen;
    private String HomeStatus;
    public SmartDoorController(String deviceName, Boolean isDeviceActive, Boolean isDoorOpen, String HomeStatus) {
        super(deviceName, isDeviceActive);
        this.isDoorOpen = isDoorOpen;
        this.HomeStatus = HomeStatus;
    }

    @Override
    public String toString(){
        return "Name: " + deviceName + "\nActive Status: " + isDeviceActive + "\nClosed: " + isDoorOpen
                + "\nHome Status: " + HomeStatus;
    }

    @Override
    public void Close() {
        if(isDoorOpen == true){
            System.out.println("LOCKING DOOR ACTIVATED");
        }
        else {
            System.out.println("ALREADY CLOSED");
        }

    }

    @Override
    public void open() {
        if(isDoorOpen == false){
            System.out.println("OPEN DOOR ACTIVATED");
        }
        else {
            System.out.println("ALREADY OPEN");
        }

    }
    @Override
    public void deviceIsOpenAlert() {
       if(isDoorOpen == true && HomeStatus == "no motion"){
           System.out.println("ALERT: THE DOOR IS OPEN");
       }
       if(isDoorOpen == false && HomeStatus == "motion"){
           System.out.println("-");
       }

    }

}
