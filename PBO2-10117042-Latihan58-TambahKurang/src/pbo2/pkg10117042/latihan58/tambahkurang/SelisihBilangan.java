package pbo2.pkg10117042.latihan58.tambahkurang;

/**
 *
 * @author Rashil
 */
public class SelisihBilangan extends Bilangan {
    
    public void tampilSelisih(){
         this.x = x;
         this.y = y;
        
        int tampilSelisih = x-y;
        System.out.println("Hasil Selisih " +x+" - " +y+ " = " +tampilSelisih);
    }
}
