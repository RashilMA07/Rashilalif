/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

import static latihan6.KambingStatic.NAMA_KAMBING; 

/**
 *
 * @author 
 * NAMA                 : Rashil Muhammad Alif
 * Kelas                : PBO-2
 * NIM                  : 10117042
 * Deskripsi Program    : Program kambing static
 */
public class Latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING +" memiliki kambing sebanyak "+ Mamalia.jumlahKambing);
    }   
}
