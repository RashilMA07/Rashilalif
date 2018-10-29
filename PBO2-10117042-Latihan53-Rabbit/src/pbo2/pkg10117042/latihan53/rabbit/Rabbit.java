package pbo2.pkg10117042.latihan53.rabbit;

/**
 *
 * @author Rashil
 */
public class Rabbit extends Animal {
     
    private String color;
    private String name;

    public Rabbit(String name, boolean veg , String food, int legs, String color) {
        super(veg, food, legs);
        
        this.vegetarian = veg;
        this.name = name;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
  
}
