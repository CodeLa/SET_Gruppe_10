package no.SetGruppe10.models;

public class TempratureAdjuster extends DeviceFoundation implements DeviceOn, DeviceOff {

    private int outSideTemp;
    private int insideTemp;

    public TempratureAdjuster(String deviceName, Boolean isDeviceActive, int outSideTemp, int insideTemp) {
        super(deviceName, isDeviceActive);
        this.insideTemp = insideTemp;
        this.outSideTemp = outSideTemp;
    }

    @Override
    public void turnDeviceOff() {

    }

    @Override
    public void turnDeviceOn() {

    }

    public int changeTemp(int temp){
        return 0;
    }
}
