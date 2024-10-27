package no.SetGruppe10.models;

 abstract public class  DeviceFoundation {
    private String DeviceName;
    private Boolean isDeviceActive = true;

    public DeviceFoundation(String deviceName,  Boolean isDeviceActive) {
        DeviceName = deviceName;
        this.isDeviceActive = isDeviceActive;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }


    public Boolean getDeviceActive() {
        return isDeviceActive;
    }

    public void setDeviceActive(Boolean deviceActive) {
        isDeviceActive = deviceActive;
    }
    abstract void deviceActiveStatus();

}
