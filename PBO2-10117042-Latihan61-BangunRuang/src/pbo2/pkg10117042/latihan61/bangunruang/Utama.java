package pbo2.pkg10117042.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung volume bangun ruang.
 */
public  abstract class Utama {
    
      public static void main(String[] args) {
     
        Bola bol= new Bola();
        bol.setJari(7);
        System.out.println("volume bola : " +bol.hitungvolume()+" cm3");
        
        Tabung tab = new Tabung();
        tab.setJari(10);
        tab.setTinggi(21);
        System.out.println("volume tabung : " +tab.hitungvolume()+" cm3");
        
        Kerucut ker = new Kerucut();
        ker.setJari(14);
        ker.setTinggi(9);
        System.out.println("volume kerucut : " +ker.hitungvolume()+" cm3");
      
        
        
    }
}
