package com.tugasakhir.alatcamping;


public class Peralatan{
    
   private String kodAlat;
   private String namaAlat;
   private String warna;
   private int hargaAlat;

   public void setkodAlat(String kode){
       this.kodAlat = kode;
       
       if (null != kode)switch (kode) {
           case "AM-001" -> {
               this.namaAlat = "KOMPOR PORTABLE";
               this.warna = "-";
               this.hargaAlat = 20000;
           }
           case "TD-001" -> {
               this.namaAlat = "TENDA";
               this.warna = "Merah";
               this.hargaAlat = 150000;
           }
           case "CRR-001" -> {
               this.namaAlat = "CARRIER";
               this.warna = "Abu - abu";
               this.hargaAlat = 150000;
           }
           case "MTS-001" -> {
               this.namaAlat = "MATRAS";
               this.warna = "Biru";
               this.hargaAlat = 30000;
           }
           case "S-001" -> {
               this.namaAlat = "SENTER";
               this.warna = "Hitam";
               this.hargaAlat = 10000;
           }
           default -> {
           }
       }
   }
    public String getkodAlat() {
        return this.kodAlat;
    }

    public String getnamaAlat() {
        return this.namaAlat;
    }

    public String getwarna() {
        return this.warna;
    }

    public int gethargaAlat() {
        return this.hargaAlat;
    }

}
       



