/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117042.latihan18.kelipatan;

/**
 *
 * @author 
 * NAMA                 : Rashil Muhammad Alif
 * KELAS                : PBO-2
 * NIM                  : 10117042
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan bilangan
 *                        kelipatan 3,5 dimulai dari 3,5 sampai dengan 35
 */
public class PBO210117042Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double bilangan;
       
       bilangan = 0;
       
       while (bilangan < 35) {
          bilangan = bilangan + 3.5;
          System.out.println(bilangan);
        }
    }
    
}

