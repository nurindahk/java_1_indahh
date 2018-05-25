/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_oop;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */

class gaji_karyawan {
    int gp;
    int tunjangan;
    int potongan;
    int nip;
    int gol;
    int gt;
    String nama;
    
    //CONSTRUCTOR
    public gaji_karyawan () {
        gp=0;
        tunjangan=0;
        potongan=0;
        gt=0;
        gol=0;
        nama="";
    }
    //PROCEDURE INPUT
    public void input_proc () {
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan Gaji Karyawan");
        System.out.print("masukan nomer induk pegawai : ");
        nip=input.nextInt();
        input.nextLine();
        System.out.print("masukan nama : ");
        nama=input.nextLine();
        System.out.print("masukan golongan [1/2/3/4] : ");
        gol = input.nextInt();
    }
    //FUNCTION GAJI
    public int gaji_tot () {
        return(gp + tunjangan - potongan);
        
    }
    
    //FUNCTION IF/SWITCH
    public void switch_case () { 
    switch(gol){
                 case 1:
                     gp= 2000000;
                     tunjangan=gp*40/100;
                     potongan=40000;
                     break;
                 case 2:
                     gp= 2500000;
                     tunjangan=gp*40/100;
                     potongan=40000;
                     break;
                 case 3:
                     gp= 3000000;
                     tunjangan=gp*50/100;
                     potongan=50000;
                     break;   
                 case 4:
                     gp= 4000000;
                     tunjangan=gp*60/100;
                     potongan=55000;
                     break;     
                 default:
                     System.out.print("Golongan yang diinputkan tidak tersedia");
                     break;
}}

     //PROCEDURE OUTPUT
    public void output () {
        System.out.println("gaji pokoknya : rp. "+gp);
        System.out.println("besar tunjangan : rp."+tunjangan);
        System.out.println("besar potongan : rp."+potongan);
        System.out.println("gaji total : rp."+gaji_tot());
   }
}
public class Tugas_oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        gaji_karyawan gk = new gaji_karyawan();
        gk.input_proc();
        gk.switch_case();
        gk.output();
    }
    
}
