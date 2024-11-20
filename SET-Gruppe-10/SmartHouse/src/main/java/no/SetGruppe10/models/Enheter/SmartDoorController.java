package no.SetGruppe10.models.Enheter;

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.Close;
import no.SetGruppe10.models.Interfaces.Open;
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
    public String Close() {
        if(isDoorOpen == true){
            return "The Door is Closed";
        }
        else {
            return "The Door is Already Closed";
        }

    }

    @Override
    public String open() {
        if(isDoorOpen == false){
            return "The Door Is Open Now";
        }
        else {
            return "The Door Was Already Open";
        }

    }
    @Override
    public void deviceIsOpenAlert() {
       if(isDoorOpen == true && motionDetected == false){
           System.out.println("ALERT!: DOOR: OPEN");
       }
       if(isDoorOpen == false && motionDetected == true){
           System.out.println("ALERT!: MOTION DETECTED");
       }
       if(isDoorOpen == false && motionDetected == false){
           System.out.println("Home Staus: DOOR LOCKED AND NO MOTION DETECTED :)");
       }
       if(isDoorOpen == true && motionDetected == true){
           System.out.println("DOOR OPEN AND MOTION DETECTED");

       }

    }

}
