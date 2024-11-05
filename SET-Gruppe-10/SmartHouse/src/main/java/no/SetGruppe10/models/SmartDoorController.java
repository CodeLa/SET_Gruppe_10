package no.SetGruppe10.models;

import no.SetGruppe10.models.deviceAlertFunctions.DeviceOpenSendAlert;

public class SmartDoorController extends DeviceFoundation implements Open, Close, DeviceOpenSendAlert {
    private Boolean isDoorOpen;
    private Boolean motionDetected;
    public SmartDoorController(String deviceName, Boolean isDeviceActive, Boolean isDoorOpen, Boolean motiondetectede) {
        super(deviceName, isDeviceActive);
        this.isDoorOpen = isDoorOpen;
        this.motionDetected = motiondetectede;
    }

    @Override
    public String toString(){
        return "Name: " + deviceName + "\nActive Status: " + isDeviceActive + "\nClosed: " + isDoorOpen
                + "\nMotion detected: " + motionDetected;
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
       if(isDoorOpen == true && motionDetected == false){
           System.out.println("ALERT!: THE DOOR IS OPEN");
       }
       if(isDoorOpen == false && motionDetected == true){
           System.out.println("ALERT!: Someone is Inside");
       }
       if(isDoorOpen == false && motionDetected == false){
           System.out.println("Home Staus: DOOR LOCKED AND NO MOTION DETECTED :)");
       }
       if(isDoorOpen == )

    }

}
