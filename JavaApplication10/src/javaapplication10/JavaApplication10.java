/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String jk,nama;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("nama : ");
        nama=inputan.nextLine();
        
        System.out.print("Jenis Kelamin (L/P) : ");
        jk=inputan.nextLine();
        /*
        if ("P".equals(jk)|| "p".equals(jk)) {
            System.out.print(nama+"Berjenis Kelamin Perempuan");
        }
        else if ("L".equals(jk) || "l".equals(jk)) {
            System.out.print(nama+"Berjenis Kelamin Laki-Laki");
        }
        else {
            System.out.print("Maaf "+nama+" jenis kelamin anda tidak terdeteksi");
        }
        */
        
       switch(jk) {
           case "P":
               System.out.print(nama+"Berjenis kelamin perempuan");
               break;
           case "L":
               System.out.print(nama+"Berjenis Kelamin Laki-Laki");
               break;
           default :
                System.out.print("Maaf "+nama+" jenis kelamin anda tidak terdeteksi");
                break;
       }
    }
    
}
