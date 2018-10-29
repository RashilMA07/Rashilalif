package pbo2.pkg10117042.latihan55.handphone;

/**
 *
 * @author Rashil
 */
public class Handphone {
    
    protected  String manufacture;
    protected  String operatingSystem;
    protected  String model;
    protected  int harga;
    
    public Handphone(String man, String os, String model, int harga){   
    }
    public void displayProduct(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
        
        System.out.println("Manufaktur \t: " +man);
        System.out.println("OS \t\t: " +os);
        System.out.println("Model \t\t: " +model);
        System.out.println("Harga \t\t: " +harga);
                
    }
}
