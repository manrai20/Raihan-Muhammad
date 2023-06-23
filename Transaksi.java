package com.tugasakhir.alatcamping;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi extends Peralatan implements Peminjam {
    
    private String kasir;
    private String peminjam;
    private int nik;
    
    public String tgl_peminjaman;
    public String tgl_pengembalian;
    
    private String[] kodAlat, namaAlat, warna;
    private int[] hargaAlat, jumPeminjaman, jumTotal;
    private int index = -1;
    private int total = 0;

    public void setBanyakPeminjaman(int jumlah) {
        this.kodAlat = new String[jumlah];
        this.namaAlat = new String[jumlah];
        this.warna = new String[jumlah];
        this.hargaAlat = new int[jumlah];
        this.jumPeminjaman = new int[jumlah];
        this.jumTotal = new int[jumlah];
    }

    public void setJumlahBeliBarang(int jumlah) {
        if (this.index == kodAlat.length - 1) {
            return;
        }
        int currentIndex = ++this.index;
        this.kodAlat[currentIndex] = super.getkodAlat();
        this.namaAlat[currentIndex] = super.getnamaAlat();
        this.warna[currentIndex] = super.getwarna();
        this.hargaAlat[currentIndex] = super.gethargaAlat();
        this.jumPeminjaman[currentIndex] = jumlah;
        this.jumTotal[currentIndex] = jumlah * super.gethargaAlat();
    }

    public void cetakTransaksi() {
        System.out.format("Kasir    : " + this.kasir+ "%n%n");
        System.out.format("NIK    : " + this.nik+ "%n");
        System.out.format("Peminjam : " + this.peminjam+ "%n%n");
        System.out.println("                              BARANG YANG DI PINJAM                                ");
        String leftAlignFormat = "| %-1s | %-8s | %-17s | %-7s | %-10d | %-6d | %-12d | %n";
        System.out.format("+---+----------+-------------------+---------+------------+--------+--------------+%n");
        System.out.format("|No.|   Kode   |     Nama Alat     |  Warna  | Harga Alat | Jumlah |     Total    |%n");
        System.out.format("+---+----------+-------------------+---------+------------+--------+--------------+%n");
        for (int i = 0; i < kodAlat.length; i++) {
            int no = i + 1;
            String kode = kodAlat[i];
            String NamaAlat = namaAlat[i]; 
            String Warna = warna[i]; 
            int harga = hargaAlat[i];
            int Jumlah = jumPeminjaman[i];
            int JumTotal = jumTotal[i];
            total = total + JumTotal;
            if (kode != null) {
                System.out.format(leftAlignFormat, no, kode, NamaAlat, Warna, harga, Jumlah, JumTotal); 
            }
        }
        
        System.out.format("+---+----------+-------------------+---------+------------+--------+--------------+%n");        
        
        
        Date now = new Date();
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MMM/YYYY");
        System.out.println("tgl. peminjaman : "+dateform.format(now));
        System.out.println("tgl. pengembalian : ");
        
    }

 
            @Override
            public void setKasir(String nama) {
                this.kasir = nama;    
            }

            @Override
            public void setPeminjam(String nama) {
                this.peminjam = nama;    
            }
            
            @Override
            public void setNIK(int nik){
                this.nik = nik;
            }
          
}


 