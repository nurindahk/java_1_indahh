/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_ganjil_genap;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Aplikasi_Ganjil_Genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Program membedakan ganjil dan genap");
        
        
        System.out.print("masukan bilangan : ");
        angka=input.nextInt();
        
        if (angka%2==0){
            System.out.print("Ini adalah bilangan genap");
        }
        else {
            System.out.print("Ini adalah bilangan ganjil");
        }
        }
        
    }
    

