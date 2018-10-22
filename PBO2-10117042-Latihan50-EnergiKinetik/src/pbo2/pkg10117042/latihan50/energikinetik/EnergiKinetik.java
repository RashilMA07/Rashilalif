package pbo2.pkg10117042.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan perhitungan energi kinetik.
 */
public class EnergiKinetik {
    
     public static void main(String[] args) {
       
        energi bola = new energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("sebuah bola baseball dengan massa: " + bola.getMassa()+"g");
        System.out.println("Bola baeball tersebut dilempar dengan kecepatan: " + bola.getKecepatan()+"m/s");
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        System.out.println("A. energi kinetik = " + bola.hitungenergikinetik1(massa, kecepatan));
        System.out.println("B. usaha pada bola  = " + bola.usaha() );
        System.out.println("P.S nilai usaha tetap,karena dimulai dari keadaan diam");
    }
    
}
