package pbo2.pkg10117042.latihan61.bangunruang;

/**
 *
 * @author Rashil
 */
public class Tabung extends BangunRuang {
    
    private double jari;
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungvolume() {
       return 3.14 * (jari * jari *tinggi);
    }

  
}
