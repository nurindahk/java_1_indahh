/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh._array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilai = 0;
        
        Scanner inputan = new Scanner(System.in);
        
        /*System.out.print("Input Nilai 3 Buah");
        
        for(int i=0;i<3;i++) {
            System.out.print("Masukkan nilai ke-"+1+" : ");
            nilai=inputan.nextInt();
        }
        System.out.print("Jadi nilainya adalah "+nilai);*/
        
        //ARRAY
        System.out.println("---------------------------");
        System.out.println("ARRAY");
        System.out.println("Input nilai 3 buah");
        
        
        //deklarasi 1
        //int nilai_ar[]=new int [10];
        
        //deklarasi 2
        int nilai_ar[];
        System.out.print("Masukkan nilai array : ");
        int x=inputan.nextInt();
        //masukkan jumlah alas pada array
        nilai_ar=new int[x];
        
        for (int i=0;i<3;i++) {
                System.out.print("Masukkan nilai ke-"+i+" : ");
                nilai_ar[i]=inputan.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                
              
        }
        
        //System.out.print("Jadi nilainya adalah ke-1 : "+nilai_ar[0]+" ke-2 : "+nilai_ar[1]+" ke-3 : "+nilai_ar[2]);
        System.out.println("Banyak data "+nilai_ar.length);
        System.out.println("Ranking Array");
        Arrays.sort(nilai_ar);
        for (int i=0;i<x;i++) {
            System.out.print("Rank-"+i+" : "+nilai_ar[i]);
        }
        }
    }
    

