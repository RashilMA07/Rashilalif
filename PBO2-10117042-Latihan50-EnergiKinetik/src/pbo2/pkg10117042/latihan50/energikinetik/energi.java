package pbo2.pkg10117042.latihan50.energikinetik;

/**
 *
 * @author Rashil 
 */
public class energi {
    
    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double hitungenergikinetik1(double n, double k){
      energikinetik1 = 0.5 * n * (k*k);
      return energikinetik1;
    }
   public void hitungenergikinetik2(double m){
       this.energikinetik2= 0.5*m*0;
   }
   public double usaha (){
       return energikinetik1 - energikinetik2;
   }
    
}
