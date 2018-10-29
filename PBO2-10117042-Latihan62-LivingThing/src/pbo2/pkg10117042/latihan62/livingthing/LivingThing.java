package pbo2.pkg10117042.latihan62.livingthing;

/**
 *
 * @author Rashil
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
       
    
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    
    }
    
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
