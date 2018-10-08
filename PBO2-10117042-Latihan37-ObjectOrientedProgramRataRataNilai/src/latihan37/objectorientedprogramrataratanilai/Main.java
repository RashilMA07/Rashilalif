/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan37.objectorientedprogramrataratanilai;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
        System.out.println("Developed by : Rizki Adam Kurniawan");

}
    }
