package pbo2.pkg10117042.latihan60.akatsuki;

/**
 *
 * @author Rashil
 */
public class Jurus extends Karakter {
    
     private String namaCincin;
     private String rekanKerja;
     private String namaDesa;
     
    public Jurus(String nama, String jurus, boolean bercincin) {
        super(nama, jurus, bercincin);
    }

    public String getNamaCincin() {
        return namaCincin;
    }

    public void setNamaCincin(String namaCincin) {
        this.namaCincin = namaCincin;
    }

    public String getRekanKerja() {
        return rekanKerja;
    }

    public void setRekanKerja(String rekanKerja) {
        this.rekanKerja = rekanKerja;
    }

    public String getNamaDesa() {
        return namaDesa;
    }

    public void setNamaDesa(String namaDesa) {
        this.namaDesa = namaDesa;
    }
    
    
    public void jurus (){
        System.out.println("jurus");
    }
        }
