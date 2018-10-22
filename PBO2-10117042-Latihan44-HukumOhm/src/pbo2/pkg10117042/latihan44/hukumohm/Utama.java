package pbo2.pkg10117042.latihan44.hukumohm;

/**
 *
 * @author Rashil Muhammad Alif
 */
public class Utama {
    
     public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai1.hitungTegangan() + " volt");
}
}
