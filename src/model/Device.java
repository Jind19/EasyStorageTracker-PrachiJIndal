package model;

public class Device {
    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                '}';
    }
}
