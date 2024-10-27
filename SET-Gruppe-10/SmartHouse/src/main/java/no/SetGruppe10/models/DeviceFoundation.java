package no.SetGruppe10.models;

 abstract public class  DeviceFoundation {
    protected String deviceName;
    protected Boolean isDeviceActive = true;

    public DeviceFoundation(String deviceName,  Boolean isDeviceActive) {
        deviceName = deviceName;
        this.isDeviceActive = isDeviceActive;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        deviceName = deviceName;
    }


    public Boolean getDeviceActive() {
        return isDeviceActive;
    }

    public void setDeviceActive(Boolean deviceActive) {
        isDeviceActive = deviceActive;
    }


}
