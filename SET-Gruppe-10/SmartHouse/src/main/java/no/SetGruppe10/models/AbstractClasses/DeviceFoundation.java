package no.SetGruppe10.models.AbstractClasses;

//Denne klassen er ment for være en basis standard for alle enheter/klasser
//Den holder på informasjoner som Navn på enhetene og om den er aktiv eller ikke.
 abstract public class  DeviceFoundation {
    protected String deviceName;
    protected Boolean isDeviceActive = true;

    public DeviceFoundation(String deviceName,  Boolean isDeviceActive) {
        this.deviceName = deviceName;
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
