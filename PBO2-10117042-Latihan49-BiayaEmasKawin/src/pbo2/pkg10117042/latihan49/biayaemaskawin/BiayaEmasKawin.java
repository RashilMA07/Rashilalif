package pbo2.pkg10117042.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 * Deskripsi Program : Program ini berisi perintah untuk Menampilkan biaya total emas.
 */
public class BiayaEmasKawin {
    
      public static void main(String[] args) {
        
        emas Emas = new emas ();
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+Emas.getHarga()+" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+Emas.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "+Emas.hitunghargaemas(Emas.getBerat(), Emas.getHarga()));
    }
    
}
