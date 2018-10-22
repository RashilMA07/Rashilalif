package pbo2.pkg10117042.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Baterai {
 
    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====\nKuat arus yang mengalir pada"
                + " suatu kawat penghantar \nakan berbanding lurus dengan beda "
                + "potensial \npada ujung-ujung kawat penghantar tersebut "
                + "asalkan suhu kawat dijaga konstan \n");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
}
}
