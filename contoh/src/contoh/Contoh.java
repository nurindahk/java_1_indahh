/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,nilai;
        Scanner inputan = new Scanner (System.in);
        
        
        
        
        for (int i=0;i<5;i++)
        {
            System.out.print("Masukkan Nama Siswa : ");
            nama=inputan.nextLine();
            System.out.print("Masukkan Nilai : ");
            nilai=inputan.nextLine();
            System.out.println("Nilai Milik Siswa ke-"+i+" dengan nama "+nama+" : "+nilai+"");
            
        }
    }       
    
}
