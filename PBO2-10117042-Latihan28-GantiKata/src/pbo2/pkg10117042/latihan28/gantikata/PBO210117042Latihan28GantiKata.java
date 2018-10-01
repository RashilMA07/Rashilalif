/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117042.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Rashil Muhammad Alif
 * KELAS                : PBO-2 
 * NIM                  : 10117042
 * Deskripsi Program    : Program ini berisi perintah untuk mengganti kata 
 *                        dalam sebuah kalimat
 */
public class PBO210117042Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
//proses
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
//output
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
        
        
        }
    
}
