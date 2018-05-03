/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_for;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugas_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,kota,jk;
        Scanner inputan = new Scanner (System.in);
        
        
        for (int i=0;i<3;i++)
        {
            System.out.println("Data Peserta Ke-"+i);
            System.out.print("Masukan Nama : ");
            nama=inputan.nextLine();
            System.out.print("Masukkan kode kota (B/D/E) : ");
            kota=inputan.nextLine();
            System.out.print("Masukkan Jenis Kelamin (P/L) : ");
            jk=inputan.nextLine();
            System.out.print(nama);
            
            
            
            
            switch (kota) {
                case "B" :
                    System.out.print(" Berasal dari Jakarta");
                    break;
                case "D" :
                    System.out.print(" Berasal dari Bandung");
                    break;
                case "E" :
                    System.out.print(" Berasal dari Cirebon");
                    break;
                default :
                    System.out.print(" Kode kota tidak tersedia");
                    break;
            }
                    
                    
                switch (jk) {
                case "P" :
                    System.out.print(" berjenis kelamin Perempuan");
                    break;
                case "L" :
                    System.out.print(" Laki-laki");
                    break;
                default :
                    System.out.print(" dan jenis kelamin tidak terdeteksi");
                    break;
                }
                
                
            System.out.println("");
        }
    }
}
            
           
                    
            
        
        
        
    
    

