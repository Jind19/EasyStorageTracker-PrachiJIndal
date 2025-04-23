package model;

public class Device {
    private String deviceName;
    private String serialNumber;

    public Device(String deviceName, String serialNumber) {
        this.deviceName = deviceName;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "deviceName='" + deviceName + '\'' +
                ", serialNumber='" + serialNumber + '\''
                ;
    }

}
