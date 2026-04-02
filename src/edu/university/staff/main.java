package edu.university.staff;

public class main {
    public static void main(String[] args) {

        Pegawai[] data = {
                new Dosen("Pak Andi", 3000000, 10),
                new StafAdministrasi("Bu Sari", 2500000, 5)
        };

        for (Pegawai p : data) {
            System.out.println(p.getInfo());
        }
    }
}