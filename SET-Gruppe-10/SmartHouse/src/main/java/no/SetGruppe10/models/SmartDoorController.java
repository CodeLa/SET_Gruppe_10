package no.SetGruppe10.models;

import no.SetGruppe10.models.deviceAlertFunctions.DeviceOpenSendAlert;

public class SmartDoorController extends DeviceFoundation implements Open, Close, DeviceOpenSendAlert {
    private Boolean isDoorOpen;
    private String HomeStatus;
    public SmartDoorController(String deviceName, Boolean isDeviceActive, Boolean isDoorOpen, String HomeStatus) {
        super(deviceName, isDeviceActive);
        this.isDoorOpen = isDoorOpen;
        this.HomeStatus = HomeStatus;

    }

    @Override
    public void Close() {

    }

    @Override
    public void open() {

    }
    @Override
    public void deviceIsOpenAlert() {

    }

}
