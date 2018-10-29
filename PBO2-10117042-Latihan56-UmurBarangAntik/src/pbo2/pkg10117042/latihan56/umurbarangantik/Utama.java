package pbo2.pkg10117042.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
     public static void main(String[] args) {
 
        Radio rad = new Radio(234);
        BarangAntik ba = new BarangAntik(234);
        rad.setName("Radio AM");
        System.out.println("Nama barang Antik : " +rad.getName() );
        ba.tampilUmur();
    }
    
}
