package pbo2.pkg10117042.latihan56.umurbarangantik;

/**
 *
 * @author Rashil
 */
public class Radio extends BarangAntik {
    
    private String name;

    public Radio(int umur) {
        super(umur);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
