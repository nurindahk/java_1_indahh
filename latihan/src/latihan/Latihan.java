/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class Elektronik {
    String nama;
    String status;
    String barang;
    String sttus_anggota;
    String status_anggota;
    int kuantitas;
    int total;
    int bayar;
    int kembalian;
    int potongan;
    int kode_barang;
    int harga;
    int jumlah_pembelian;
    int jumlah;
    
    //CONSTRUCTOR
    public Elektronik () {
        nama="";
        status="";
        barang="";
        status_anggota="";
        kuantitas=0;
        total=0;
        bayar=0;
        kembalian=0;
        potongan=0;
        kode_barang=0;
        harga=0;
        sttus_anggota="";
        jumlah_pembelian=0;
        jumlah=0;
    }
    //PROCEDURE INPUT
    public void input () {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Nama : ");
        nama=inputan.nextLine();
        System.out.print("Status [Member/Non] : ");
        status=inputan.nextLine();
        System.out.print("Pembelian Barang [Kulkas,TV,Motor] : ");
        barang=inputan.nextLine();
        System.out.print("Kuantitas : ");
        kuantitas=inputan.nextInt();
    }
    //FUNCTION Barang
    public int Barang () {
        switch(barang){
            case "Kulkas":
            if ("Non".equals(status))
            {
                harga = 3500000;
            }
            else if ("Member".equals(status))
            {
                harga=3500000-3500000*10/100;
            }
                break;
            case "TV": 
            if ("Non".equals(status))
            {
                harga = 2100000;
            }
            else if ("Member".equals(status))
            {
                harga=2100000-2100000*10/100;
            }
                break;
            case "Motor":
             if ("Non".equals(status))
            {
                harga = 15000000;
            }
            else if ("Member".equals(status))
            {
                harga=15000000-15000000*10/100;
            }
                break;
            default:
                harga=0;
                break;
    }
        return harga;
    }
        
        //function total 
        public int total () {
           
            switch(status){
            case "Member" :
                jumlah=harga*kuantitas;
                break;
            case "Non Member":
                jumlah=harga*kuantitas;
                break;
            }
                return jumlah;
        
    }
       
        //Procedure OUTPUT
        public void output () {
            Scanner inputan = new Scanner(System.in);
            System.out.println("Total : "+jumlah); 
            System.out.print("Bayar : ");
            bayar=inputan.nextInt();
            kembalian();
            System.out.println("Kembalian : "+kembalian);
            System.out.println("Terimakasih telah membeli");
        }

 public int kembalian () {
            kembalian=bayar-jumlah;
            return(kembalian);
        }
public class Latihan {

    /**
     * @param args the command line arguments
     */
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        Elektronik ek = new Elektronik ();
            ek.input();
            ek.Barang();
            ek.total();
            ek.kembalian();
            ek.output();
            
        }
    }
    

