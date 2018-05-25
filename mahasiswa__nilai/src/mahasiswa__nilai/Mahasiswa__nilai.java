/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa__nilai;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class mahasiswanilai{
    String jmlhnilai,Nomor_mahasiswa, Nama_mahasiswa, Kelas, Semester, Nilai_pemograman, Nilai_database, Nilai_design, Nilai_algoritma;
    int nilai, np, ndbs, nds, na;
    double ratarata, jumlah_nilai;



//contructor
public mahasiswanilai(){
    Nomor_mahasiswa="";
    Nama_mahasiswa="";
    Kelas="";
    Semester="";
    Nilai_pemograman="";
    Nilai_database="";
    Nilai_design="";
    Nilai_algoritma="";
    ratarata=0.0;
    jumlah_nilai=0.0;
    nilai=0;
}        

//Procedure input
public void input (){
        Scanner input= new Scanner(System.in);
        System.out.print("Nomor Induk Mahasiswa : ");
        Nomor_mahasiswa=input.nextLine();   
        
        System.out.print("Nama Mahasiswa : ");
        Nama_mahasiswa=input.nextLine();
        
        System.out.print("Kelas: ");
        Kelas=input.nextLine();        
      
        System.out.print("Semester : ");
        Semester=input.nextLine();
        
        System.out.print("Nilai Pemrograman [A/B/C/D/E] : ");
        Nilai_pemograman=input.nextLine();
        
        System.out.print("Nilai Database [A/B/C/D/E] : ");
        Nilai_database=input.nextLine();
        
        System.out.print("Nilai Design [A/B/C/D/E] : ");
        Nilai_design=input.nextLine();
        
        System.out.print("Nilai Algoritma [A/B/C/D/E] : ");
        Nilai_algoritma=input.nextLine();

}

//Function Ifelse
public void ifelse (){

        if ("A".equals(Nilai_pemograman))
                {
                    np=4;
                    }
        else if ("B".equals(Nilai_pemograman))
                {   
                    np=3;
                    }
        else if ("C".equals(Nilai_pemograman))
                {   
                    np=2;
                    }
        else if ("D".equals(Nilai_pemograman))
                {   
                    np=1;
                    }
        else 
                {   np=0;
                    }
        
        if ("A".equals(Nilai_database))
                {
                    ndbs=4;
                    }
        else if ("B".equals(Nilai_database))
                {   
                    ndbs=3;
                    }
        else if ("C".equals(Nilai_database))
                {   
                    ndbs=2;
                    }
        else if ("D".equals(Nilai_database))
                {   
                    ndbs=1;
                    }
        else 
                {   ndbs=0;
                    }
        
        if ("A".equals(Nilai_design))
                {
                    nds=4;
                    }
        else if ("B".equals(Nilai_design))
                {   
                    nds=3;
                    }
        else if ("C".equals(Nilai_design))
                {   
                    nds=2;
                    }
        else if ("D".equals(Nilai_design))
                {   
                    nds=1;
                    }
        else 
                {   nds=0;
                    }
        
        
        if ("A".equals(Nilai_algoritma))
                {
                    
                    na=4;
                    }
        else if ("B".equals(Nilai_algoritma))
                {   
                    na=3;
                    }
        else if ("C".equals(Nilai_algoritma))
                {   
                    na=2;
                    }
        else if ("D".equals(Nilai_algoritma))
                {   
                    na=1;
                    }
        else 
                {   na=0;
                    }
        
        
    }

public double Jumlahnilai(){
    //mengubah variabel str menjadi int
        int Nilai_pemograman=np;
        int Nilai_database=ndbs;
        int Nilai_design=nds;
        int Nilai_algoritma=na;
        jumlah_nilai=(Nilai_pemograman*4)+(Nilai_database*3)+(Nilai_design*1)+(Nilai_algoritma*2);
    return (jumlah_nilai);
}

public double rata_rata(){
    ratarata = jumlah_nilai/10;
    return (ratarata);
}

public void output(){
    Scanner input= new Scanner(System.in);
        System.out.println("==============================");
        ifelse();
        System.out.println("Nomor Induk Mahasiswa : "+ Nomor_mahasiswa);
        System.out.println("Nama Mahasiswa : "+Nama_mahasiswa);
        System.out.println("Kelas: "+Kelas);
        System.out.println("Semester : "+Semester);
        Jumlahnilai();   
        System.out.println("Jumlah nilai "+ jumlah_nilai);
        rata_rata();
        System.out.println("Rata-rata nilai "+ ratarata);

    }
}

public class Mahasiswa__nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   mahasiswanilai mhs=new mahasiswanilai();    
    mhs.input();
    mhs.output();
    }
    
}
