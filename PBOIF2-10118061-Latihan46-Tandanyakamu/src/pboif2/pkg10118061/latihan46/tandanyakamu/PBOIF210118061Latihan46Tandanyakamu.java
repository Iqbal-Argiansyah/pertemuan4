/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan46.tandanyakamu;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Tandanya kamu
 */
public class PBOIF210118061Latihan46Tandanyakamu {
public static int yearnow,umur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        yearnow = Calendar.getInstance().get(Calendar.YEAR);
        age hasil = new age(yearnow);
        System.out.println("masukkan tahun lahir anda :");
        hasil.setYearbirth( userInput.nextInt());
        System.out.println("==========hasil perhitungan umur============");
        System.out.println("tahun lahir anda: "+hasil.getYearbirth());
        System.out.println("hari ini tahun: "+hasil.getYearnow());
        System.out.println("umur kamu samapai hari ini adalah "+hasil.hitungumur()+"tahun");
        System.out.println("tandanya kamu "+hasil.tandanyakamu(umur));
    }
}
