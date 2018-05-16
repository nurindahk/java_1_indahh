/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ini_ujian;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Ini_ujian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nr, jumlah_pesanan, HE,HB,HS,total,tanggal,kode_kelas;
        String nama_pemesan,nama_rute,kelas,jumlah_kursi;
        
        Scanner inputan = new Scanner(System.in);
        
        for (int i=1;i<=2;i++) {
            
            
            
            System.out.println("1. Jakarta - Bandung");
            System.out.println("Ekonomi : 90.000");
            System.out.println("Bisnis : 130.000");
            System.out.println("Eksekutif : 170.000");
            System.out.println("2. Jakarta - Yogyakarta");
            System.out.println("Ekonomi : 100.000");
            System.out.println("Bisnis : 180.000");
            System.out.println("Eksekutif : 250.000");
            
            
            System.out.print("Nama Pemesan : ");
            nama_pemesan=inputan.nextLine();
            System.out.print("Rute Kereta [1/2] : ");
            nr=inputan.nextInt();
            System.out.print("Kelas [Eko/Bis/Eks] : ");
            kode_kelas=inputan.nextInt();
            System.out.print("Jumlah Kursi : ");
            jumlah_pesanan=inputan.nextInt();
            System.out.print("Tanngal Keberangkatan : ");
            tanggal=inputan.nextInt();
         
                
            }
    }
}
    


