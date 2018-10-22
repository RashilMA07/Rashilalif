package pbo2.pkg10117042.latihan49.biayaemaskawin;

/**
 *
 * @author Rashil Muhammad Alif
 */
public class emas {
    
    private double harga=570000;
    private double berat;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    public double hitunghargaemas(double parHarga, double parBerat){
        return berat*harga;
    }
}
