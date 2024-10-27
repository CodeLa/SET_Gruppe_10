package no.SetGruppe10.models;

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
    public void turnDeviceOff() {

    }

    @Override
    public void turnDeviceOn() {

    }
}
