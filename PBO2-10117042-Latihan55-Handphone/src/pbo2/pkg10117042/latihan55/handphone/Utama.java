package pbo2.pkg10117042.latihan55.handphone;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
     public static void main(String[] args) {
     Handphone hp = new Android("Samsung", "Android", "Grand", 3000000);
     hp.displayProduct("Samsung", "Android", "Grand", 3000000);
     
     Android ad = new Android("Samsung", "Android", "Grand", 3000000);
     ad.setKeyStore("234ibfd3840fo");
     System.out.println("Android Key Store : " +ad.getKeyStore()+"\n");
     
     Handphone hp2 = new BlackBerry("BlackB","RIM", "Curve", 200000);
     hp.displayProduct("BlackB","RIM", "Curve", 2000000);
   
     BlackBerry bb = new BlackBerry("BlackB","RIM", "Curve", 200000);
     ad.setKeyStore("BHS249");
     System.out.println("PIN \t\t: " +ad.getKeyStore()+"\n");
  
     Handphone hp3 = new BlackBerry("Nokia","Win8", "Lumia", 100000);
     hp.displayProduct("Nokia","Win8", "Lumia", 1000000);
   
     WindowsPhone wp = new WindowsPhone("Nokia","Win8", "Lumia", 100000);
     ad.setKeyStore("UUUQIJWORJ");
     System.out.println("Wp Key Store \t: " +ad.getKeyStore()+"\n");
      
    }
    
}
