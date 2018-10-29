package pbo2.pkg10117042.latihan52.siapakamu;

/**
 *
 * @author Rashil
 */
public class Mahasiswa extends Manusia {
    
    private String nim;
    private String Kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun "
                + "sedang belajar di kelas PBO2");
                  
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    
}
