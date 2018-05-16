/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_selasa;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh_Selasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int a;
        
        
        System.out.print("Masukkan Angka : ");
        
        if(!input.hasNextInt()) {
            System.out.println("That's not a number !");
        }
        else {
            a = input.nextInt();
            System.out.println("number "+a);
            
        }
   
    }
}
    

