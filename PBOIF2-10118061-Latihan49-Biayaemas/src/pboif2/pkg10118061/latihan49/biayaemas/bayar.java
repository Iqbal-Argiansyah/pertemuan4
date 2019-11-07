/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan49.biayaemas;

/**
 *
 * @author Iqbal
 */
public class bayar {
      private double berat,harga;

    bayar(double berat, double harga) {
        this.berat=berat;
        this.harga=harga;
    }

    public double getBerat() {
        berat = 15.7;
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        harga = 570.000;
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double hitungemas(){
        
        return berat*harga;
    } 
    public void tampil(){
        System.out.println("mahar nikah seberat =  "+ berat+" gram ");
        System.out.println("harga =  "+"RP. "+ harga);
        System.out.println("total bayar yang hasur di keluarkan hendi = "+"Rp. "+hitungemas()+" juta ");
    }
    
}
