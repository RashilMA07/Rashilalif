/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117042.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Rashil Muhammad Alif
 * KELAS                : PBO-2 
 * NIM                  : 10117042
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan huruf 
 *                        besar dan kecil pada sebuah kalimat
 */
public class PBO210117042Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine = lebih dari 1 kata

        hBesar = kalimat.toUpperCase();
        hKecil = kalimat.toLowerCase();

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hBesar);
        System.out.println("Huruf Kecil : " + hKecil);

    }

}
