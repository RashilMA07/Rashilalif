package pbo2.pkg10117042.latihan61.bangunruang;

/**
 *
 * @author Rashil
 */
public class Kerucut extends BangunRuang {
    
    private double jari;
    private double tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }


    @Override
    public double hitungvolume() {
        return Math.ceil(Math.PI*jari*jari*tinggi/3);
    }
     
}
