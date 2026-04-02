package edu.university.model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa() {}

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getKategoriIPK() {
        if (ipk >= 3.5) return "Cumlaude";
        else if (ipk >= 3.0) return "Sangat Memuaskan";
        else if (ipk >= 2.5) return "Memuaskan";
        else return "Perlu Perbaikan";
    }

    public String getData() {
        return nim + " - " + nama + " - IPK: " + ipk + " (" + getKategoriIPK() + ")";
    }
}