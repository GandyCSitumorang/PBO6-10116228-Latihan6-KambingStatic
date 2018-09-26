/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan6.kambingstatic;

/**
 *
* @author 
 *  Dosen   : Rizki Adam Kurniawan
 *  Nama    : Gandy Christian Situmorang
 *  kelas   : PBO6
 *  NIM     : 10116228
 *  deskripsi program    : Program ini berisi program latihan Kambing static
 *
 */
public class kambingstatic {
    //Nama_Kambing sebagai konstanta
    public static final String Nama_Kambing = "Mbek";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing  + " memiliki kambing sebanyak " +
                Mamalia.jumlahKambing);
    }
 
}
