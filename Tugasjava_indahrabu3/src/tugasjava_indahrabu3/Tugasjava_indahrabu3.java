/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava_indahrabu3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugasjava_indahrabu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nj, jumlah_pesanan, harga = 0, total;
        String nama_jurusan = null,nama_pemesan  = null;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("Jurusan Bus Antar Kota");
        System.out.println("1. BSD - Bandung");
        System.out.println("2. Bandung - BSD");
        
        
        System.out.print("Nama Pemesan : ");
        nama_pemesan=inputan.nextLine();
        System.out.print("Jumlah Kursi : ");
        jumlah_pesanan=inputan.nextInt();
        System.out.print("Jurusan : ");
        nj=inputan.nextInt();
        
        
        switch (jumlah_pesanan){
            case 1:
                nama_jurusan="BSD - Bandung";
                harga=70000;
                break;
            case 2 :
                nama_jurusan="Bandung - BSD";
                harga=50000;
                break;
            default :
                System.out.print("Maaf, Silahkan imput ulang");
        }
        if (jumlah_pesanan>=1 && jumlah_pesanan<=2) {
        total=harga*jumlah_pesanan;
        System.out.print("Tiket telah dipesan oleh "+nama_pemesan+" jurusan "+nama_jurusan+" dengan jumlah "+jumlah_pesanan+" tiket dengan total bayar yaitu "+total);
    
}
}
}
