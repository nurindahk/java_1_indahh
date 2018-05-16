/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_kelompok2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugas_Kelompok2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,j,i;
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran huruf H : ");
        if (!inputan.hasNextInt()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        {
        n=inputan.nextInt();
        i=1;
        while (i<=n)
            {
                j=1;
                while (j<=n) {
            
                  if (i==n/2+1 || j==1 || j==n) 
                  {
                 
                     System.out.print("*");   
                   }
                 
                 else { 
                         System.out.print(" ");
                  }
                  j++;
             }
                i++;
             System.out.println();
            
        }}}}