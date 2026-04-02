package edu.university.main;

import edu.university.model.Mahasiswa;

public class main {
    public static void main(String[] args) {
        Mahasiswa[] mhs = {
                new Mahasiswa("001", "Ahmad", 3.7),
                new Mahasiswa("002", "Budi", 3.2),
                new Mahasiswa("003", "Citra", 2.8)
        };

        for (Mahasiswa m : mhs) {
            System.out.println(m.getData());
        }
    }
}