package pbo2.pkg10117042.latihan41.MassaJenis;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
    public static void main(String[] args){
        Kubus kbs = new Kubus();
        
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Massa : " + kbs.getMassa());
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
        
    }
}
