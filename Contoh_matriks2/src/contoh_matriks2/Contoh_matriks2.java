/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_matriks2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh_matriks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int matriks_a [][] = new int [2][2];
        int matriks_b[][] = new int [2][2];
        
        Scanner input_matriks=new Scanner (System.in);
        
        System.out.println("INPUT MATRIKS A");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print("Masukkan Angka Untuk matriks A ["+i+"] ["+j+"] : ");
                matriks_a[i][j]=input_matriks.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("INPUT MATRIKS B");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print("Masukkan Angka Untuk matriks B ["+i+"] ["+j+"] : ");
                matriks_b[i][j]=input_matriks.nextInt();
            }
        }
        /*System.out.println();
        matriks_a[0][0]=1;
        matriks_a[0][1]=2;
        matriks_a[1][0]=3;
        matriks_a[1][1]=4;
        
        matriks_b[0][0]=5;
        matriks_b[0][1]=3;
        matriks_b[1][0]=2;
        matriks_b[1][1]=4;
        /*
        int hasil_penjumlahan[][] = new int [2][2];
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                 hasil_penjumlahan[i][j]=matriks_a[i][j]+matriks_b[i][j];
            }
        }
        
         System.out.println("Matriks A");
        for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_a[i][j]+ " ");
            }
            System.out.println("]");
        }
        
         System.out.println("Matriks B");
        for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_b[i][j]+ " ");
            }
            System.out.println("]");
        }
        
        System.out.println();
        System.out.println("MATRIKS A + MATRIKS B");
         for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(hasil_penjumlahan[i][j]+ " ");
            }
            System.out.println("]");
        }*/
         int hasil_perkalian[][] = new int [2][2];
         
        hasil_perkalian[0][0]=matriks_a[0][0]*matriks_b[0][0]+matriks_a[0][1]*matriks_b[1][0];
        hasil_perkalian[0][1]=matriks_a[0][0]*matriks_b[0][1]+matriks_a[0][1]*matriks_b[1][1];
        hasil_perkalian[1][0]=matriks_a[1][0]*matriks_b[0][0]+matriks_a[1][1]*matriks_b[1][0];
        hasil_perkalian[1][1]=matriks_a[1][0]*matriks_b[0][1]+matriks_a[1][1]*matriks_b[1][1];
        
        System.out.println();
        System.out.println("MATRIKS A * MATRIKS B");
         for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(hasil_perkalian[i][j]+ " ");
            }
            System.out.println("]");
        }
         
         
        
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                int hasil = 0;
                for (int k=0;k<2;k++){
                //System.out.println(" i : "+i+" k : "+k+" j:"+j );
                hasil += matriks_a [i][k]*matriks_b[k][j];
                
                }  
                hasil_perkalian[i][j]=hasil;
            }
        }
    
        
        System.out.println();
        System.out.println("MATRIKS A * MATRIKS B");
         for(int i=0;i<2;i++) {
            System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(hasil_perkalian[i][j]+ " ");
            }
            
            System.out.println("]");
        }}}
    
        /*
        hasil_penjumlahan[0][0]=matriks_a[0][0]+matriks_b[0][0];
        hasil_penjumlahan[0][1]=matriks_a[0][1]+matriks_b[0][1];
        hasil_penjumlahan[1][0]=matriks_a[1][0]+matriks_b[1][0];
        hasil_penjumlahan[1][1]=matriks_a[1][1]+matriks_b[1][1];
        */
        /*System.out.println("Matriks A");
        for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_a[i][j]+ " ");
            }
            System.out.println("]");
        }
        
         System.out.println("Matriks B");
        for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_b[i][j]+ " ");
            }
            System.out.println("]");
        }
        
        System.out.println();
        System.out.println("MATRIKS A + MATRIKS B");
         for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_b[i][j]+ " ");
            }
            System.out.println("]");
        }
        
        
        /*System.out.println(" ["+hasil_penjumlahan[0][0]+" "+hasil_penjumlahan[0][1]+"]");
        System.out.println(" ["+hasil_penjumlahan[1][0]+" "+hasil_penjumlahan[1][1]+"]");*/

