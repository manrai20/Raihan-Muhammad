package com.tugasakhir.alatcamping;


public class Main {

    public static void main(String[] args) {
        
        Transaksi kons1 = new Transaksi();
        kons1.setKasir("REHAN");
        kons1.setNIK(267123682);
        kons1.setPeminjam("Mr. Beli");
        kons1.setBanyakPeminjaman(3);

        kons1.setkodAlat("AM-001");
        kons1.setJumlahBeliBarang(5);

        kons1.setkodAlat("MTS-001");
        kons1.setJumlahBeliBarang(2);

        kons1.setkodAlat("S-001");
        kons1.setJumlahBeliBarang(1);
        kons1.cetakTransaksi();
    }
}