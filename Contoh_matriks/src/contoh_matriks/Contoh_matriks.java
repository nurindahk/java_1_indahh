/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_matriks;

/**
 *
 * @author GeeksFarm
 */
public class Contoh_matriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriks_a[] = new int[2];
        int matriks_b[] = new int [2];
        
        matriks_a[0]=1;
        matriks_a[1]=2;
        
        matriks_b[0]=3;
        matriks_b[1]=4;
        
        int hasil[] = new int[2];
        
        hasil[0]= matriks_a[0]+matriks_b[0];
        hasil[1]=matriks_a[1]+matriks_b[1];
        System.out.print("[ "+hasil[0]+" "+hasil[1]+" ]");
        
    }
    
}
