/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117042.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Rashil Muhammad Alif 
 * KELAS                : PBO-2 
 * NIM                  : 10117042 
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung
 *                        rata-rata nilai yang berasal dari user
 */
public class PBO210117042Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNilai = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int nSiswa = input.nextInt();

        for (int i = 1; i <= nSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");

            int nilai = input.nextInt();
            totalNilai += nilai;
        }
        double nilaiRataRata = (double) totalNilai / nSiswa;
        System.out.println("\n"+"Maka, Rata-rata Nilainya adalah " + 
        nilaiRataRata);
        System.out.println("Developed by : Rashil Muhammad Alif");

    }

}

