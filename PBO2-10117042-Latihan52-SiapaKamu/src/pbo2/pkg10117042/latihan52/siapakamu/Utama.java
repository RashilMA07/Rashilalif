package pbo2.pkg10117042.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
     public static void main(String[] args) {
     
          Dosen dsn = new Dosen();
     
          dsn.setNama("Rizky Adam Kurniawan");
          dsn.setNip("41227829930");
          dsn.setMataKuliah("PBO");
     

     Mahasiswa mhs = new Mahasiswa();
     
          mhs.setNim("10110269");
          mhs.setNama("Nindi");
          mhs.setKelas("PBO2");
       
        System.out.println("NIP DOSEN : " +dsn.getNip());
          dsn.siapaKamu();
          dsn.mengajarApa();
        
        System.out.println("NIM MAHASISWA : " +mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
              
    }
    
}
