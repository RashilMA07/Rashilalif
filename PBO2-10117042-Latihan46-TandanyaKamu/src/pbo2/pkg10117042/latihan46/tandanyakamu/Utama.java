package pbo2.pkg10117042.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Rashil Muhammad Alif
 */
public class Utama {
    
    public static void main(String[] args) {

        Scanner scn1 = new Scanner(System.in);
        Age ag = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+ag.getYearBirth());
        System.out.println("Hari ini tahun : "+ag.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+ag.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu : "+ag.tandanyaKamu(ag.hitungUmur()));

    }
}
