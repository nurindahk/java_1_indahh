/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Kelompok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriks_a [][] = new int [2][2];
        int matriks_b[][] = new int [2][2];
        int matriks_c [][] = new int [2][2];
        
        Scanner input_matriks=new Scanner (System.in);
        
       

        matriks_a[0][0]=5;
        matriks_a[0][1]=1;
        matriks_a[1][0]=3;
        matriks_a[1][1]=4;
        
        matriks_b[0][0]=6;
        matriks_b[0][1]=8;
        matriks_b[1][0]=7;
        matriks_b[1][1]=1;
        
        matriks_c[0][0]=4;
        matriks_c[0][1]=1;
        matriks_c[1][0]=6;
        matriks_c[1][1]=1;
        
        
        int hasil_perkalian[][] = new int [2][2];
        int hasil_kali_a [][] = new int [2][2];
        int hasil_total [][] = new int [2][2];
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                 hasil_perkalian[i][j]=matriks_b[i][j]*matriks_c[i][j];
            }
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                 hasil_kali_a[i][j]=matriks_b[i][j]*matriks_c[i][j];
            }
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                 hasil_total[i][j]=4*matriks_a[i][j]+matriks_b[i][j]*matriks_c[i][j];
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
         System.out.println("Matriks C");
        for(int i=0;i<2;i++) {
             System.out.print("[");
            for(int j=0;j<2;j++) {
                 System.out.print(matriks_b[i][j]+ " ");
            }
            System.out.println("]");
        } System.out.println();
    
        System.out.println("MATRIKS B * MATRIKS C");
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
                hasil += matriks_b [i][k]*matriks_c[k][j];
                
                }  
                hasil_total[i][j]=hasil;
            }
        }
        }
    }


        



