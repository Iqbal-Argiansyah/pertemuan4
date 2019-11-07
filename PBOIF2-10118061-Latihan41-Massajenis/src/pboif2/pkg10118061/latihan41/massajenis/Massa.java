/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan41.massajenis;

/**
 *
 * @author Iqbal
 */
public class Massa {
    int sisi,masa;

    public int getSisi() {
        return sisi*sisi*sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMasa() {
        return masa/getSisi();
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
    
    
    
    public void massaJenis(){
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi:"+sisi);
        System.out.println("Massa:"+masa);
    }
    
    public  void volume(){
         System.out.println("=====Hasil Perhitungan=====");
         System.out.println("Volume:"+getSisi());
         System.out.println("Massa Jenis:"+getMasa());
     }
}
        