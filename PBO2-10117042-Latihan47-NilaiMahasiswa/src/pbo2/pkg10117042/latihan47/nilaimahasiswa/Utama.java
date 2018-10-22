package pbo2.pkg10117042.latihan47.nilaimahasiswa;

import java.util.Scanner;
/**
 *
 * @author Rashil Muhammad Alif
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung nilai akhir 
 * mahasiswa berdasarkan nilai quis,uts dan uas
 */
public class Utama {
    
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        NilaiMhs nilai = new NilaiMhs();

        System.out.print("QUIZ \t = ");
        nilai.setQuiz(scn.nextDouble());

        System.out.print("UTS \t = ");
        nilai.setUts(scn.nextDouble());

        System.out.print("UAS \t = ");
        nilai.setUas(scn.nextDouble());

        System.out.println("\nNilai Akhir = " + nilai.nilaiAkhir());
        System.out.println("\nIndex = " + nilai.indexNilai());
        System.out.println("Keterangan = " + nilai.keterangan());

    }
}
