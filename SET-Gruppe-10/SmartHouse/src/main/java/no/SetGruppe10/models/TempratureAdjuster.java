package no.SetGruppe10.models;

public class TempratureAdjuster extends DeviceFoundation  {

    private int outSideTemp;
    private int insideTemp;

    public TempratureAdjuster(String deviceName, Boolean isDeviceActive) {
        super(deviceName, isDeviceActive);
    }
}
