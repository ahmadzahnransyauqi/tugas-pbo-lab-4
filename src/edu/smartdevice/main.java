package edu.smartdevice;

public class main {
    public static void main(String[] args) {

        SmartWatch sw = new SmartWatch();

        sw.chargeBattery(50);
        sw.connectWifi("WiFi Kampus");

        System.out.println("Battery: " + sw.getBatteryLevel() + "%");
        System.out.println("Connected: " + sw.isConnected());
    }
}