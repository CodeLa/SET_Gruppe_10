package no.SetGruppe10.models.Devices;
//Denne klassen er ment for å styre døren(åpne/låse)
//Den har inneholder funksjoner som sender en Varsel melding basert på husets verdier
//Verdier som: motionDetetcted == true && isDoorOpen == true

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
    public String toString() {
        return "Name: " + deviceName + "\nActive Status: " + isDeviceActive + "\nClosed: " + isDoorOpen
                + "\nMotion detected: " + motionDetected;
    }

    @Override
    public String Close() {
        if (isDoorOpen == true) {
            return "The Door is Closed";
        } else {
            return "The Door is Already Closed";
        }

    }

    @Override
    public String open() {
        if (isDoorOpen == false) {
            return "The Door Is Open Now";
        } else {
            return "The Door Was Already Open";
        }

    }

    @Override
    public String deviceIsOpenAlert() {
        if (isDoorOpen == true && motionDetected == false) {
            return ("ALERT!: DOOR: OPEN");
        }
        if (isDoorOpen == false && motionDetected == true) {
            return ("ALERT!: MOTION DETECTED");
        }
        if (isDoorOpen == false && motionDetected == false) {
            return ("Home Staus: DOOR LOCKED AND NO MOTION DETECTED :)");
        }
        if (isDoorOpen == true && motionDetected == true) {
            return ("DOOR OPEN AND MOTION DETECTED");

        }
        else {
            return "Something Went Wrong";
        }

    }

}
