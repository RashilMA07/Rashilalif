package pbo2.pkg10117042.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        Scanner scn1 = new Scanner (System.in);
        Scanner scn2 = new Scanner (System.in);
        Scanner scn3 = new Scanner (System.in);
        Scanner scn4 = new Scanner (System.in);
        
        Manager man = new Manager();
        
        System.out.println("====Program Perhitungan gaji karyawan====");
        System.out.print("Masukkan NIK : ");
        man.setNik(scn.nextLine());
        System.out.print("Masukkan Nama : " );
        man.setNama(scn1.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        man.setGolongan(scn2.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        man.setJabatan(scn3.nextLine());
        System.out.print("Jumlah Kehadiran : ");
        man.setKehadiran(scn4.nextInt());
  
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK :" + man.getNik());
        System.out.println("Nama : " + man.getNama());
        System.out.println("GOLONGAN : " + man.getGolongan());
        System.out.println("JABATAN : "+ man.getJabatan());
        System.out.println("\nTUNJANGAN GOLONGAN : "+ man.tunjanganGolongan(man.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + man.tunjanganJabatan(man.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+man.tunjanganKehadiran(man.getKehadiran()));
        System.out.println("\nGAJI TOTAL : " + man.gajiTotal());
    }
}
