package no.SetGruppe10.models.Devices;

/*/
Denne klassen er ment for å representer en enhet som måler gassnivået i huse
 */

import no.SetGruppe10.models.AbstractClasses.DeviceFoundation;
import no.SetGruppe10.models.Interfaces.DeviceOff;
import no.SetGruppe10.models.Interfaces.DeviceOn;
import no.SetGruppe10.models.deviceAlertFunctions.GasLeakSendAlert;

public class GasLeakDetector extends DeviceFoundation implements DeviceOff, DeviceOn, GasLeakSendAlert {
    private double gasLevel;


    public GasLeakDetector(String deviceName, Boolean isDeviceActive, double gasLevel) {
        super(deviceName, isDeviceActive);
        this.gasLevel = gasLevel;
    }

    @Override
    public String toString() {
        return "Device Name: " + deviceName + "\nActive Status" + isDeviceActive + "\nGas Level: "
                + gasLevel + "ppm";
    }


    public double getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(double gasLevel) {
        this.gasLevel = gasLevel;
    }

    @Override
    public String turnDeviceOff() {
        if (isDeviceActive == true) {
            return "The Device is Off Now";
        } else {
            return "Device Was Already Off";
        }
    }

    @Override
    public String turnDeviceOn() {
        if (isDeviceActive == false) {
            return "The Device is On Now";
        } else {
            return "The Device Was Already On";

        }
    }

    @Override
    public String gasLeakDetetctedSendAlert() {
        if (gasLevel >= 50 && gasLevel <= 199) {
            return "Carbon Monoxide Detected";
        }
        if (gasLevel >= 200 && gasLevel <=799) {
            return "Dangerous Levels Of Carbon Monoxide, Call the Fire departemnt";
        }
        if (gasLevel >= 800) {
            return "Life Threatening Levels of Carbon Monoxide,Call Emergency Services";
        } else {
            return "Normal Levels Of Carbon Monoxide";
        }
    }
}
