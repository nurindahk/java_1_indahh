/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_pertama;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Ujian_pertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah_pesanan = 0,HE=0,HB=0,HS=0,total,tanggal = 0,harga = 0,;
        String nama_pemesan = null,rute_kereta = null,kode_kelas = null,kelas,nama_rute;
        
        Scanner inputan = new Scanner (System.in);
        
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
            rute_kereta=inputan.nextLine();
            System.out.print("Kelas [Eko/Bis/Eks] : ");
            kode_kelas=inputan.nextLine();
            System.out.print("Jumlah Kursi : ");
            jumlah_pesanan=inputan.nextInt();
            System.out.print("Tanggal Keberangkatan : ");
            tanggal=inputan.nextInt ();
            
            switch (rute_kereta) {
                case "1" : 
            nama_rute = "Jakarta - Bandung";
                    if ("Eko".equals(harga));
                    {
                        harga="90000";
                    }
                    else if ("Bis".equals (harga));
                    {
                        harga="130000";
                    }
                    else if ("Eks".equals(harga));
                    {
                        harga="170000";
                    }
                    break;
                    }
            }
            if (jumlah_pesanan>=1 && jumlah_pesanan<=2) 
            {
            
            System.out.println("Terimakasih anda telah memesan tiket kereta dengan rincian sebagai berikut ");
            System.out.println("Tanggal keberangkatan : "+tanggal);
            System.out.println("Nama : "+nama_pemesan);
            System.out.println("Rute : "+rute_kereta);
            System.out.println("Kelas : "+kode_kelas);
            System.out.println("Harga Satuan : "+harga);
            System.out.println("Jumlah Kursi : "+jumlah_pesanan);
            System.out.println("Total Bayar : ");
            System.out.println("Silahkan membayar di indomaret terdekat");
        }
    }
}

                    
    
    


