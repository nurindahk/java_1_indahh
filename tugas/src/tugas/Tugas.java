/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */

class Travel {
    String nama;
    String jurusan;
    String jenis;
    String nama_jurusan;
    String fasilitas;
    String AC;
    String Non_AC;
    String ulang;
    int tiket;
    int harga;
    int total;
    int kembalian;
    int jumlahuang;
    int bayar;
    int uang;
    
    //CONSTRUCTOR 
    public Travel () {
        nama="";
        jurusan="";
        jenis="";
        nama_jurusan="";
        fasilitas="";
        AC="";
        Non_AC="";
        ulang="";
        tiket=0;
        harga=0;
        total=0;
        kembalian=0;
        jumlahuang=0;
        bayar=0;
        uang=0;
    }
    
    //PROCEDURE INPUT
    public void input () {
        Scanner inputan = new Scanner(System.in);   
        System.out.println("===================================================");
            System.out.println("          =              Jenis                    ");
            System.out.println("Jurusan   =      AC      =====      Non AC        ");
            System.out.println("==================================================");
            System.out.println("Banten    =    90.000     =====     70.000        = ");
            System.out.println("Semarang  =    85.000     =====     60.000        = ");
            System.out.println("Jogja     =    60.000     =====     40.000        = ");
            System.out.println("==================================================");
            
            
            
            System.out.print("Nama Pemesan : ");
            nama=inputan.nextLine();
            System.out.print("Jurusan : ");
            jurusan=inputan.nextLine();
            System.out.print("Jenis : ");
            jenis=inputan.nextLine();
            System.out.print("Banyak Tiket : ");
            tiket=inputan.nextInt();
            
    }
    //Function Switch
    public void Switch () {
         switch (jurusan) {
                case "Banten" :
          
            if ("AC".equals(jenis))
            {
                harga=90000;
            }
            else if ("Non_AC".equals(jenis))
            {
                harga=70000;
            }
                break;
               
             case "Semarang" :
           
            if ("AC".equals(jenis))
            {
                harga=85000;
            }
            else if ("Non_AC".equals(jenis))
            {
                harga=60000;
            }
            
            break;
            
            case "Jogja" :
            
            if ("AC".equals(jenis))
            {
                harga=60000;
            }
            else if ("Non_AC".equals(jenis))
            {
                harga=40000;
            }
            
            break;
            
             default :
                 nama_jurusan="Maaf Silahkan Input Ulang";
                
         }
    }
   
    //FUNCTION TOTAL 
     public int total () {
        total=harga*tiket;
            return(total);
         }    
        public void jumlahuang () {
        Scanner inputan = new Scanner(System.in);
            System.out.println("Harga Satuan untuk "+jurusan+" adalah "+harga);
            System.out.println("==========================================");
            System.out.println(nama+" harus membayar sebesar "+total);
            System.out.print("Masukkan Jumlah Uang : ");
            uang=inputan.nextInt();
            System.out.println("==========================================");
            
        }
    //Function Kembalian
        public int kembalian () {
            kembalian=uang-total;
            return(kembalian);
        }

    //PROCEDURE OUTPUT
        public void output () {
            Scanner inputan = new Scanner(System.in);  
            System.out.println("Kembalian : "+kembalian);
            System.out.print("Ulang lagi [Y/N] : ");
            ulang=inputan.nextLine();
            System.out.println("===========================");
        
      
        }  
        }
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pilihan;
        Scanner inputan = new Scanner(System.in);
        do {
            Travel tl = new Travel ();
        tl.input();
        tl.Switch();
        tl.total();
        tl.jumlahuang();
        tl.kembalian();
        tl.output();
        
            System.out.print("Masukkan Pilihan : ");
            pilihan=inputan.next();
        } while("Y".equals(pilihan));
        }

     
    }
    
