package pbo2.pkg10117042.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
       public static void main(String[] args) {
        
        Vehicle vhc = new Vehicle();
        Bicycle bcl = new Bicycle();
        
        vhc.setMyBrand("Trek Bike");
        vhc.setMyModel("7.4 FX");
        bcl.setMyGearCount(23);
        
        System.out.println("Brand : "+vhc.getMyBrand());
        System.out.println("Model : "+vhc.getMyModel());
        System.out.println("Jumlah Gear : "+bcl.getMyGearCount()+"\n");
    
        Vehicle vhc2 = new Vehicle();
        Skateboard skt = new Skateboard();
  
        vhc2.setMyBrand("Ally Skate");
        vhc2.setMyModel("Rocket");
        skt.setMyBoardLenght(54.5);
        
        System.out.println("Brand : "+vhc2.getMyBrand());
        System.out.println("Model : "+vhc2.getMyModel());
        System.out.println("Panjangnya Board : "+skt.getMyBoardLenght());
    }
    
}
