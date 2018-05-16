/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava_senin4;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugasjava_senin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai,waktu;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Program mencetak waktu");
        System.out.print("-----------");
        
        System.out.print("masukan jam : ");
        waktu=inputan.nextInt();
        
        if (waktu>=5 && waktu<=11)
        {
            System.out.print("pagi");
        }
        else if (waktu>=12 && waktu<=18)
        {
            System.out.print("siang");
        }
        else if (waktu>=19 && waktu<=24)
        {
            System.out.print("malam");
        }
        else if (waktu>=1 && waktu<=4)
        {
            System.out.print("Dini hari");
        }
        else
        {
            System.out.print ("pilihan tidak tersedia");
        }
        }
        
        
        
        
        
    }
    
