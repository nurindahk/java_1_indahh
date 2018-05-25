/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa_nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class mahasiswanilai {
    String Nomor_mahasiswa,Nama_mahasiswa,Kelas,Semester,Nilai_pemograman,Nilai_database,Nilai_design,Nilai_algoritma,nilaimatakuliah,nilai;
    double Nilai_mahasiswa,nilai_mhs,nms;
    int jumlah_nilai,rata2;
    //CONSTRUCTOR
    public mahasiswanilai () {
        Nomor_mahasiswa="";
        Nama_mahasiswa="";
        Kelas="";
        Semester="";
        Nilai_pemograman="";
        Nilai_database="";
        Nilai_design="";
        Nilai_algoritma="";
        nilaimatakuliah="";
        nilai="";
        jumlah_nilai=0;
        rata2=0;
        Nilai_mahasiswa=0;
        nilai_mhs=0;
        nms=0;
    }
    //PROCEDURE INPUT
    public void input () {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Selamat datang di program Nilai Mahasiswa");
        System.out.println("-----------------------------------------");
        System.out.println("Inputkan Data Anda");
        System.out.print("Masukkan nomor mahasiswa              : ");
        Nomor_mahasiswa=inputan.nextLine();
        System.out.print("Masukkan Nama Mahasiswa               : ");
        Nama_mahasiswa=inputan.nextLine();
        System.out.print("Masukkan Kelas                        : ");
        Kelas=inputan.nextLine();
        System.out.print("Masukkan Semester                     : ");
        Semester=inputan.nextLine();
        System.out.print("Masukkan Nilai Pemograman [A/B/C/D/E] : ");
        nilai=inputan.nextLine();
        System.out.print("Masukkan nilai database [A/B/C/D/E]   : ");
        nilai=inputan.nextLine();
        System.out.print("Masukkan nilai design [A/B/C/D/E]     : ");
        nilai=inputan.nextLine();
        System.out.print("Masukkan nilai algoritma [A/B/C/D/E]  : ");
        nilai=inputan.nextLine();
       
    }
        //PROCEDURE OUTPUT
        public int output () {
        Scanner inputan = new Scanner(System.in);
        System.out.print("----------------------------------------");
        System.out.print("Hasil data anda");
        System.out.print("Nomor mahasiswa : "+Nomor_mahasiswa);
        System.out.print("Nama Mahasiswa : "+Nama_mahasiswa);
        System.out.print("Kelas Mahasiswa : "+Kelas);
        System.out.print("Semester mahasiswa : "+Semester);
        System.out.print("jumlah nilai : "+jumlah_nilai);
        System.out.print("rata-rata : "+rata2);
       
        

     //Function switch
     public void ifelse () {
            
        if ("A".equals(Nilai_pemograman))
            {
                nilai_mhs=4;
            }
            else if ("B".equals(Nilai_pemograman))
            {
                nilai_mhs=3;
            }
            else if ("C".equals(Nilai_pemograman))
            {
                nilai_mhs=2;
            }
            else if ("D".equals(Nilai_pemograman))
            {
                nilai_mhs=1;
            }
                

        if ("A".equals(Nilai_database))
            {
                nilai_mhs=4;
            }
            else if ("B".equals(Nilai_database))
            {
                nilai_mhs=3;
            }
            else if ("C".equals(Nilai_database))
            {
                nilai_mhs=2;
            }
            else if ("D".equals(Nilai_database))
            {
                nilai_mhs=1;
            }    
           
            
        if ("A".equals(Nilai_design))
            {
                nilai_mhs=4;
            }
            else if ("B".equals(Nilai_design))
            {
                nilai_mhs=3;
            }
            else if ("C".equals(Nilai_design))
            {
                nilai_mhs=2;
            }
            else if ("D".equals(Nilai_design))
            {
                nilai_mhs=1;
            }  
            
            
            
        if ("A".equals(Nilai_algoritma))
            {
                nilai_mhs=4;
            }
            else if ("B".equals(Nilai_algoritma))
            {
                nilai_mhs=3;
            }
            else if ("C".equals(Nilai_algoritma))
            {
                nilai_mhs=2;
            }
            else if ("D".equals(Nilai_algoritma))
            {
                nilai_mhs=1;
            }    

        public double total(){
            jumlah_nilai = (Nilai_pemograman*4)+(Nilai_database*3)+(Nilai_design*1)+(Nilai_algoritma*2);
            return(jumlah_nilai);
        
         //Function rata
            rata2=jumlah_nilai/10;
            return(rata2);
           
    }

public class Mahasiswa_nilai {

    /**
     * @param args the command line arguments
     */
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        mahasiswanilai mhs = new mahasiswanilai();
        mhs.input();
        mhs.ifstring();
        mhs.output();
    
}
}
