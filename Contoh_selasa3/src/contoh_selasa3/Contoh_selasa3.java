/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_selasa3;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh_selasa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan panjang/lebar kotak : ");
        if (!input.hasNextInt()) {
            System.out.print("Harus Angka! Tidak bisa diproses");
        }
        else {
            n=input.nextInt();
            for (int i=1;i<=n;i++) {
              for (int j=1;j<=n;j++) {
                if (j==1 || j==n || i==1 || i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            }}}}
    
    

    
