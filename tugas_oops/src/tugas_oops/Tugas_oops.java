/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_oops;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */

class nilai_mhs {
    String nama;
    int nb;
    int npm;
    int np1;
    int np2;
    int total;
    String hm;
    
    //CONSTRUCTOR
    public nilai_mhs () {
        nama="";
        nb=0;
        npm=0;
        np1=0;
        np2=0;
        total=0;
        hm="";
    }
    //PROCEDURE INPUT 
    public void input () {
        Scanner inputan = new Scanner(System.in);
        System.out.println("inputan dalam");
        System.out.println("Masukkan Nama Anda : ");
        nama=inputan.nextLine();
        inputan.nextLine();
        System.out.print("masukan npm anda : ");
        npm=inputan.nextInt();
        System.out.print("masukan nilai Pembimbing : ");
        nb=inputan.nextInt();
        System.out.print("masukan nilai penguji 1 : ");
        np1=inputan.nextInt();
        System.out.print("masukan nilai Penguji 2 : ");
        np2=inputan.nextInt();
    }
    //FUNCTION TOTAL
    public int nilai() {
        return((npm*40/100)+(np1*30/100)+(np2*30/100));
    }

    //FUNCTION HURUF MUTU
    public void nilai_mutu () {
    if (total<=100 && total>=80)
        {
            System.out.print("A");
        }
        else if (total<=80 && total>=71)
        {
            System.out.print("B");
        }
        else if (total<=70 && total>=61)
        {
            System.out.print("C");
        }
        else if (total<=60 && total>=10)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print ("pilihan tidak tersedia");
        }
    }



//PROCEDURE OUTPUT
public void output () {
    System.out.println("Nama : "+nama);
    System.out.println("NPM : "+npm);
    System.out.println("Nilai Pembimbing : "+nb);
    System.out.println("Nilai Penguji 1 : "+np1);
    System.out.println("Nilai Penguji 2 : "+np2);
    System.out.println("Total : "+nilai());
    System.out.println("Huruf Mutu : "+hm);
}
}

public class Tugas_oops {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        nilai_mhs mh = new nilai_mhs ();
        mh.input();
        mh.nilai();
        mh.nilai_mutu();
        mh.output();
    }
    
}
