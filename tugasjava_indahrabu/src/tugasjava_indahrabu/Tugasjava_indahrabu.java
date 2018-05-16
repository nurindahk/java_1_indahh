/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava_indahrabu;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugasjava_indahrabu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kode,kota;
        
        Scanner inputan = new Scanner(System.in);
        
        
        
        System.out.print("Kode Plat (B/D/E) : ");
        kode=inputan.nextLine();
        
        if ("B".equals(kode)|| "b".equals(kode)) {
            System.out.print("Jakarta");
        }
        else if ("D".equals (kode) || "d".equals(kode)) { 
            System.out.print ("Bandung");
        }
        else if ("E".equals(kode)|| "e".equals(kode)) {
            System.out.print ("Cirebon");
        }
        else {
            System.out.print("maaf"+"nama"+ "Daftar Kota Tidak tersedia");
        }
        }
    }
    

