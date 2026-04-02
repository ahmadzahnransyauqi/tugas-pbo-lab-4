package edu.transport;

public class main {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Avanza", 100);
        Motor motor = new Motor("Vario", 100);

        double jarak = 120;

        System.out.println("Mobil: " + mobil.hitungWaktuTempuh(jarak) + " jam");
        System.out.println("Motor: " + motor.hitungWaktuTempuh(jarak) + " jam");
    }
}