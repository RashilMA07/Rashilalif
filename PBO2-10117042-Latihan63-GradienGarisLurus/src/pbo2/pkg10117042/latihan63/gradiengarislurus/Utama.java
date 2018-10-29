package pbo2.pkg10117042.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 */
public class Utama {
    
    public static void main(String[] args) {
        
        Koordinat krd = new Koordinat(2, 10, 5, 7);
        Koordinat kor1 = new Koordinat(5, 1, 3, 12);

        
        System.out.println("Garis yang melalui titik (" + krd.getX1() + ", " + krd.getY1()
                + ") dan  (" + krd.getX2() + ", " + krd.getY2() + ") memiliki gradien sebesar "
                + krd.hitungGradien() + "\n");

        
        System.out.println("Garis yang melalui titik (" + kor1.getX1() + ", " + kor1.getY1()
                + ") dan  (" + kor1.getX2() + ", " + kor1.getY2() + ") memiliki gradien sebesar "
                + kor1.hitungGradien() + "\n");

    }        
}   
        