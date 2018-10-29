package pbo2.pkg10117042.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA     : Rashil Muhammad Alif
 * KELAS    : PBO-2
 * NIM        : 10117042
 * Deskripsi Program    : menampilkan karakter dari akatsuki.
 */
public class Utama {
    
    public static void main(String[] args){
        
        Jurus jur = new Jurus("Pain", " Rine Tensei,Shinra Tensei,Chibaku Tensei,BanshoTein", true);
        jur.setNamaCincin("Nol"); jur.setRekanKerja("Konan");jur.setNamaDesa("Amegakure");
        
        Jurus jur2 = new Jurus("Konan", "Paper Shuriken, Paper Clone ", true);
        jur2.setNamaCincin("Putih"); jur2.setRekanKerja("Pain");jur2.setNamaDesa("Amegakure");
        
        Jurus jur3 = new Jurus("Zetsu", " Boka nu Jutsu (Hitam), Kisei Bunshin (Putih)", true);
        jur3.setNamaCincin("Babi Hutan"); jur3.setRekanKerja("Obito Uchiha");jur3.setNamaDesa("Chakra Kaguya");
        
        Jurus jur4 = new Jurus("Kisame Hoshigaki", "Daikodan no Jutsu, Dai Bakusui, Mizu Bunshin ", true);
        jur4.setNamaCincin("Selatan"); jur4.setRekanKerja("Itachi");jur4.setNamaDesa("Kirigakure");
        
        Jurus jur5 = new Jurus("Tobi", " Sharingan,Kamui,Genjutsu ", true);
        jur5.setNamaCincin("Berlian"); jur5.setRekanKerja("Zetsu");jur5.setNamaDesa("Konohagakure");
        
        Jurus jur6 = new Jurus("Deidara", " C3 Ohako, C1, C2 Dragon ", true);
        jur6.setNamaCincin("Biru/Hijau"); jur6.setRekanKerja("Sasori, Tobi");jur6.setNamaDesa("Iwagakure");
        
        Jurus jur7 = new Jurus("Hidan", "Shiji Hyoketsu ", true);
        jur7.setNamaCincin("Tiga"); jur7.setRekanKerja("Kakuzu");jur7.setNamaDesa("Yugakure");
        
        Jurus jur8 = new Jurus("Kakuzu", "Jiongu, Doton, Katon, Suiton, Raiton", true);
        jur8.setNamaCincin("Utara"); jur8.setRekanKerja("Hidan");jur8.setNamaDesa("Takigakure");
        
        Jurus jur9 = new Jurus("Orochimaru", "Edo Tensei, Fushi Tensei, Shiki Fujin ", true);
        jur9.setNamaCincin("Langit"); jur9.setRekanKerja("Sasori");jur9.setNamaDesa("Konohagakure, Otogakure");
        
        Jurus jur10 = new Jurus("Sasori", " Kugutsu no Jutsu, Satetsu", true);
        jur10.setNamaCincin("Virgo"); jur10.setRekanKerja("Orochimaru, Deidara");jur10.setNamaDesa("Sunagakure");
        
        Jurus jur11 = new Jurus("Itachi Uchiha", " Gokakyu no Jutsu, Mangekyo Sharingan, Izanami", true);
        jur11.setNamaCincin("Merah Darah"); jur11.setRekanKerja("Kisame");jur11.setNamaDesa("Konohagakure");
        
         
        System.out.println("===== Menampilkan Karakter Para Tokoh Dari Akatsuki=====");
         
        System.out.println("Nama : " + jur.nama);
        System.out.println("Jurus : " + jur.jurus);
        System.out.println("Nama Desa : " + jur.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur.getRekanKerja());
        System.out.println("Bercincin : " + jur.bercincin);
        System.out.println("Nama Cincin : " + jur.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur2.nama);
        System.out.println("Jurus : " + jur2.jurus);
        System.out.println("Nama Desa : " + jur2.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur2.getRekanKerja());
        System.out.println("Bercincin : " + jur2.bercincin);
        System.out.println("Nama Cincin : " + jur2.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur3.nama);
        System.out.println("Jurus : " + jur3.jurus);
        System.out.println("Nama Desa : " + jur3.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur3.getRekanKerja());
        System.out.println("Bercincin : " + jur3.bercincin);
        System.out.println("Nama Cincin : " + jur3.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur4.nama);
        System.out.println("Jurus : " + jur4.jurus);
        System.out.println("Nama Desa : " + jur4.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur4.getRekanKerja());
        System.out.println("Bercincin : " + jur4.bercincin);
        System.out.println("Nama Cincin : " + jur4.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur5.nama);
        System.out.println("Jurus : " + jur5.jurus);
        System.out.println("Nama Desa : " + jur5.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur5.getRekanKerja());
        System.out.println("Bercincin : " + jur5.bercincin);
        System.out.println("Nama Cincin : " + jur5.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur6.nama);
        System.out.println("Jurus : " + jur6.jurus);
        System.out.println("Nama Desa : " + jur6.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur6.getRekanKerja());
        System.out.println("Bercincin : " + jur6.bercincin);
        System.out.println("Nama Cincin : " + jur6.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur7.nama);
        System.out.println("Jurus : " + jur7.jurus);
        System.out.println("Nama Desa : " + jur7.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur7.getRekanKerja());
        System.out.println("Bercincin : " + jur7.bercincin);
        System.out.println("Nama Cincin : " + jur7.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur8.nama);
        System.out.println("Jurus : " + jur8.jurus);
        System.out.println("Nama Desa : " + jur8.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur8.getRekanKerja());
        System.out.println("Bercincin : " + jur8.bercincin);
        System.out.println("Nama Cincin : " + jur8.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur9.nama);
        System.out.println("Jurus : " + jur9.jurus);
        System.out.println("Nama Desa : " + jur9.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur9.getRekanKerja());
        System.out.println("Bercincin : " + jur9.bercincin);
        System.out.println("Nama Cincin : " + jur9.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur10.nama);
        System.out.println("Jurus : " + jur10.jurus);
        System.out.println("Nama Desa : " + jur10.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur10.getRekanKerja());
        System.out.println("Bercincin : " + jur10.bercincin);
        System.out.println("Nama Cincin : " + jur10.getNamaCincin() + "\n");
        
        System.out.println("Nama : " + jur11.nama);
        System.out.println("Jurus : " + jur11.jurus);
        System.out.println("Nama Desa : " + jur11.getNamaDesa() );
        System.out.println("Rekan Kerja : " + jur11.getRekanKerja());
        System.out.println("Bercincin : " + jur11.bercincin);
        System.out.println("Nama Cincin : " + jur11.getNamaCincin() + "\n");
     
    }
}
