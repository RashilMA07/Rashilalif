package pbo2.pkg10117042.latihan55.handphone;

/**
 *
 * @author Rashil
 */
public class WindowsPhone extends Handphone {
    
    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}
