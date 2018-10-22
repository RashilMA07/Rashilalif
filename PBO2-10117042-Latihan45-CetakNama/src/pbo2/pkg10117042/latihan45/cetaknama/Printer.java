package pbo2.pkg10117042.latihan45.cetaknama;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Printer {
    
     private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    public void cetak (String nama){
        System.out.println("Nama anda : " + nama);
    
    }
    
    public void cetak (int jmlCetak, String nama){
        for (int i = 1; i <= jmlCetak; i++) {
            
            System.out.println((i)+". "+ nama);
            
        }
    }
}
