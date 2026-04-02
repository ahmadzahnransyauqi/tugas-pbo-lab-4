package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    @Override
    public void chargeBattery(int menit) {
        batteryLevel += menit;
        if (batteryLevel > 100) batteryLevel = 100;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.ssid = ssid;
            connected = true;
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }
}