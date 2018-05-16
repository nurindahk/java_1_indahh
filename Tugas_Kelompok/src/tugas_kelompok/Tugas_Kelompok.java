/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_kelompok;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Tugas_Kelompok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jnt=0,rt = 0,nilai_mhs,total=0;
        String akr = null;
        
        Scanner inputan= new Scanner (System.in);
        
        System.out.println("--------------");
        System.out.println("Program Nilai");
        System.out.println("---------------");
        
        int nilai=1;
        do {
            System.out.print("Nilai Mahasiswa ke-"+nilai+" : ");
            nilai_mhs=inputan.nextInt();
            nilai++;
            total+=nilai_mhs;
            rt=total/10;
        }
        while (nilai<11);
        
        if (rt>85)
        {
            akr="Grade A";
        }
        if (rt>70)
        {
            akr="Grade B";
        }
        if (rt>50)
        {
            akr="Grade BAN-PT";
        }
        if (rt<=50)
        {
            akr="Tidak Terakreditasi";
        }
         
        System.out.println("Jumlah Nilai Total = "+total+"");
        System.out.println("Rata-rata = "+rt+"");
        System.out.println("Akreditasi = "+akr+"");
        
        
        
        
        
        
        
        
       
        
      
       
                
                
                 
       
        
        
        
     
        
     
    

    }
}
