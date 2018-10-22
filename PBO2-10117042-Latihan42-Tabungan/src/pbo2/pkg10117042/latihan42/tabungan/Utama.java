package pbo2.pkg10117042.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Rashil Muhammad Alif
 */
public class Utama {
    
     public static void main(String[] args) {
        int jumlah;
        Scanner scn = new Scanner (System.in);

        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tbg = new Tabungan(scn.nextInt());
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = scn.nextInt();
       
        System.out.println("Saldo Anda Sekarang : "+tbg.ambilUang(jumlah));
        
    }
 
}
