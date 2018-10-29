package pbo2.pkg10117042.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 * Deskripsi Program    : program ini berisi perintah untuk menampilkan karakter dari serial detective conan. 
 */
public class Utama {

    public static void main(String[] args) {
        Tua tua = new Tua("Shinichi Kudo (Conan Edogawa)", " Seorang Detektif SMU Terkenal", true);
        tua.setUkuranBadan("Kecil");
        Tua tu1 = new Tua("Ran Mouri", "Teman Conan Dari Kecil dan Anak Dari Seorang Detektif dan Pengacara Terkenal", false);
        tu1.setUkuranBadan("Besar");
        Tua tu2 = new Tua("Kid si Pencuri", "Seorang Pencuri Jenius dan Ahli Menyamar", true);
        tu2.setUkuranBadan("Besar");
        Tua tu3 = new Tua("Eisuke Hondo", " Teman Sekelas Ran Mouri", true);
        tu3.setUkuranBadan("Besar");
        Tua tu4 = new Tua("Masumi Sera", " Seorang Detektif Perempuan ", false);
        tu4.setUkuranBadan("Besar");                
        Muda mud = new Muda("Kogoro Mouri", "Seorang Detektif Swasta", false);
        mud.setUkuranBadan("Besar");
        Muda mu1 = new Muda("Eri Kisaki", "Seorang Pengacara", true);
        mu1.setUkuranBadan("Besar");
        Muda mu2 = new Muda("Dr. Tomoaki Araide", "Seorang Dokter Umum", true);
        mu2.setUkuranBadan("Besar");
        Muda mu5 = new Muda("Yusaku Kudo", "Ayahnya Shinichi dan Seorang Novelis", true);
        mu5.setUkuranBadan("Besar");
                        
        System.out.println("===== Menampilkan Para Tokoh Dalam Serial Detective Conan=====");
       
        System.out.println("Nama : " + tua.nama);
        System.out.println("Peran : " + tua.peran);
        System.out.println("Berkacamata : " + tua.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tua.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + tu2.nama);
        System.out.println("Peran : " + tu2.peran);
        System.out.println("Berkacamata : " + tu2.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu2.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + tu3.nama);
        System.out.println("Peran : " + tu3.peran);
        System.out.println("Berkacamata : " + tu3.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu3.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + tu4.nama);
        System.out.println("Peran : " + tu4.peran);
        System.out.println("Berkacamata : " + tu4.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu4.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + tu1.nama);
        System.out.println("Peran : " + tu1.peran);
        System.out.println("Berkacamata : " + tu1.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + tu1.getUkuranBadan() + "\n");

        System.out.println("Nama : " + mud.nama);
        System.out.println("Peran : " + mud.peran);
        System.out.println("Berkacamata : " + mud.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mud.getUkuranBadan() + "\n");

        System.out.println("Nama : " + mu1.nama);
        System.out.println("Peran : " + mu1.peran);
        System.out.println("Berkacamata : " + mu1.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mu1.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + mu2.nama);
        System.out.println("Peran : " + mu2.peran);
        System.out.println("Berkacamata : " + mu2.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mu2.getUkuranBadan() + "\n");
        
        System.out.println("Nama : " + mu5.nama);
        System.out.println("Peran : " + mu5.peran);
        System.out.println("Berkacamata : " + mu5.berkacamata);
        System.out.println("Ukuran/Bentuk Badan : " + mu5.getUkuranBadan() + "\n");
        
    }

}
