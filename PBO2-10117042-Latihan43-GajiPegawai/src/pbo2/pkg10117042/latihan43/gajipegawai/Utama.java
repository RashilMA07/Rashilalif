package pbo2.pkg10117042.latihan43.gajipegawai;

/**
 *
 * @author Rashil Muhammad Alif
 */
public class Utama {
    
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();

        gp.setNama("Rashil Muhammad Alif");
        gp.setAlamat("Permata Kopo Blok EA 257");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);

        gp.tampilData(gp.getNama(), gp.getUangTunjangan(), gp.getUangTransport(),
                gp.getGajiPokok(), gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
}
}
