package pbo2.pkg10117042.latihan59.detectiveconan;

/**
 *
 * @author Rashil
 */
public class Muda extends Karakter {
    
    private String ukuranBadan;
    
    public Muda(String nama, String peran, boolean berkacamata) {
        super(nama, peran, berkacamata);
    }

    public String getUkuranBadan() {
        return ukuranBadan;
    }
    
     public void umur (){
        System.out.println("Muda");
    }

    public void setUkuranBadan(String ukuranBadan) {
        this.ukuranBadan = ukuranBadan;
    }
    
}
