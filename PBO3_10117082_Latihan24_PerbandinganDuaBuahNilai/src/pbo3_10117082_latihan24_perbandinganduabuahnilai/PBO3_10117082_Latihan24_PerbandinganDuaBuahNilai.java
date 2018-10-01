/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan24_perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perbandingan
* dua buah nilai dan inputannya berasal dari user
 */

public class PBO3_10117082_Latihan24_PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        String ulang;
        Scanner scn = new Scanner (System.in);
        System.out.println("======PROGRAM PERBANDINGAN NILAI======");
    
do {
            System.out.println("Masukkan Nilai Pertama\t : ");
     nilai1 = scn.nextInt();
     System.out.println("Masukkan Nilai Kedua\t : ");
     nilai2 = scn.nextInt();
     
     if (nilai1>nilai2){
         System.out.println("Hasil\t\t\t :"+nilai1+" Lebih Besar Dari "
         +nilai2+"\n");   
     }
     else if(nilai1<nilai2){
         System.out.println("Hasil\t\t\t : "+nilai1+" Lebih Kecil Dari "
         +nilai2+"\n");
     }
     else
         System.out.println("Hasil\t\t\t : "+nilai1+" Sama Dengan "+nilai2+"\n");
             
    System.out.println("Ulangi Aktifitas ? (YA/TIDAK) : ");
 ulang = scn.next();
 
    System.out.println(""); 
} while (!ulang.equals("TIDAK"));
}
}