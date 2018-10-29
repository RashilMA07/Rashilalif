package pbo2.pkg10117042.latihan59.detectiveconan;

/**
 *
 * @author Rashil
 */
public class Tua extends Karakter {
    
    private String ukuranBadan;
    
    
    public Tua(String nama, String peran, boolean berkacamata) {
        super(nama, peran, berkacamata);
    }

    public String getUkuranBadan() {
        return ukuranBadan;
    }
    
    public void umur (){
        System.out.println("Tua");
    }

    public void setUkuranBadan(String ukuranBadan) {
        this.ukuranBadan = ukuranBadan;
    }
}
