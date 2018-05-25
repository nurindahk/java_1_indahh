/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks_bagi;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Matriks_bagi {

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
            System.out.println();
        }
        int hasil_pembagian [][] = new int [2][2];
        
        hasil_pembagian[0][0]=matriks_a[0][0]/matriks_b[0][0]+matriks_a[0][1]/matriks_b[1][0];
        hasil_pembagian[0][1]=matriks_a[0][0]/matriks_b[0][1]+matriks_a[0][1]/matriks_b[1][1];
        hasil_pembagian[1][0]=matriks_a[1][0]/matriks_b[0][0]+matriks_a[1][1]/matriks_b[1][0];
        hasil_pembagian[1][1]=matriks_a[1][0]/matriks_b[0][1]+matriks_a[1][1]/matriks_b[1][1];
        
    }}
        System.out.println("Hasil Pembagian : ");
        for (int i=0;i<2;i++) {
            for (int j=0;j<2;j++) {
                for (int k=0;k<2;k++) {
                    pembagian [i][j]-= a[i][k]/b[j][k];
}
System.out.print(pembagian [i][j])
}

}

    
    

