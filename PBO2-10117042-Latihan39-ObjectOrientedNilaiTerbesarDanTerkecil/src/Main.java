/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        petugas ptg = new petugas();
        DaftarNilai dafNilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i = 0; i < dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah " + dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah " + dafNilai.nKecil);

        System.out.print("\nPetugas : " + ptg.namaPetugas);
       
}
    }
