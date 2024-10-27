package no.SetGruppe10.models;

public class Oven extends DeviceFoundation implements IsDeviceOff {
    private Boolean isOvenOn;
    private Boolean isOvenOff;
    public Oven(String deviceName,  Boolean isDeviceActive, Boolean isOvenOn){
        super(deviceName, isDeviceActive);
        this.isOvenOn = isOvenOn;

    }
    @Override
    public String toString(){
        return "Name: " + deviceName + "\nActive Status: " + isDeviceActive + "\nOn/Off: " + isOvenOn;
    }

    public Boolean getOvenOn() {
        return isOvenOn;
    }

    public void setOvenOn(Boolean ovenOn) {
        isOvenOn = ovenOn;
    }

    @Override
    public void turnOff() {
        if(isOvenOn == true){
            System.out.println("Status: Off");
        } else if (isOvenOff == true){
            System.out.println("Status: Already Off");
        }
    }
}
