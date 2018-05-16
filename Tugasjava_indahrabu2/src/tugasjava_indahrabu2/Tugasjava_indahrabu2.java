/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava_indahrabu2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugasjava_indahrabu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pesanan, jumlah_pesanan,harga = 0,total;
        String nama_pesanan = null;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("menu");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Air Mineral");
        
        
        System.out.print("Pesanan : ");
        pesanan=inputan.nextInt();
        System.out.print("Jumlah Pesanan : ");
        jumlah_pesanan=inputan.nextInt();
        
        
        switch(pesanan) {
            case 1:
                nama_pesanan="Kopi";
                harga=25000;
                break;
            case 2:
                nama_pesanan="Teh";
                harga=15000;
                break;
            case 3:
                nama_pesanan="Air Mineral";
                harga=10000;
                break;
            default :
                System.out.print("Maaf silahkan input ulang pesanan anda");
                break;
           
                
        }
        if (pesanan>=1 && pesanan<=3) {
            total=harga*jumlah_pesanan;
            System.out.println("Silahkan membayar Rp "+total+"");
            System.out.print("Terimakasih anda telah memesan "+ nama_pesanan+" sebanyak "+ jumlah_pesanan +" gelas, silahkan tunggu pesanan anda");
        }
    }
    
}
