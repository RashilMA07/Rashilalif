package pbo2.pkg10117042.latihan61.bangunruang;

/**
 *
 * @author Rashil
 */
public class Bola extends BangunRuang {
    
    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    
    @Override
    public double hitungvolume() {
        return Math.ceil(4*Math.PI*jari*jari*jari/3);
        
    }
}
