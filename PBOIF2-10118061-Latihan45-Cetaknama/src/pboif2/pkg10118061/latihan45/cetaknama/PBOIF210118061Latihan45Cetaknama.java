/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan45.cetaknama;
import java.util.Scanner;


/**
 *
 * @author Iqbal
 * Iqbal Argiansyah
 * 10118061
 * IF2
 * Cetak Nama
 */
public class PBOIF210118061Latihan45Cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Aplikasi Pencetakan Nama====== ");
        Scanner userInput = new Scanner(System.in);
        printer hasil = new printer();
        System.out.println("Masukkan nama anda : ");
        hasil.setNama(userInput.nextLine()) ;
        System.out.println("Mau cetak nama berapa kali? :");
        hasil.setJmlcetak( userInput.nextInt()) ;
         
     hasil.cetak(hasil.getNama());
        hasil.cetak1(hasil.getJmlcetak(),hasil.getNama());
  
        
    }
    }
    

