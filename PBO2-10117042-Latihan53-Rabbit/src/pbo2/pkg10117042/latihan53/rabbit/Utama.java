package pbo2.pkg10117042.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
        public static void main(String[] args) {

        Rabbit rbt = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " +rbt.getName());
        System.out.println(rbt.getName()+" is " + "Vegetarian ? " +rbt.isVegetarian());
        System.out.println(rbt.getName()+" eats " + rbt.getEats());
        System.out.println(rbt.getName()+ " has " +rbt.getNoOfLegs()+ " legs.");
        System.out.println(rbt.getName()+" color is "+rbt.getColor());
    }
    
}
