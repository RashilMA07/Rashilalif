package pbo2.pkg10117042.latihan42.tabungan;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Tabungan {
   
        private final int saldo;

        public Tabungan(int saldo) {
        this.saldo = saldo;
    }
        public int ambilUang(int jumlah) {
        return saldo - jumlah;

    }
}
