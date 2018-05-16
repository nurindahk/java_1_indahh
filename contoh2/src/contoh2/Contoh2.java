/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh2;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class Contoh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,kode_kota,jenis_kelamin,nama_kota,jk;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=1;i<=3;i++) {
            System.out.println("------------------------------------");
            System.out.println("Data Peserta ke-"+i);
            System.out.println("------------------------------------");
            System.out.print("Masukkan Nama : ");
            nama=scan.nextLine();
            System.out.print("Masukkan Kode Kota (B/D/E): ");
            kode_kota=scan.nextLine();
            System.out.print("Masukkan Jenis Kelamin (P/L): ");
            jenis_kelamin=scan.nextLine();
            
            
            switch (kode_kota) {
                case "B":
                    nama_kota="Jakarta";
                    break;
                case "D":
                    nama_kota="Bandung";
                    break;
                case "E":
                    nama_kota="Cirebon";
                    break;
                default :
                    nama_kota="Kota tidak tersedia";
                    break;
            }
            
            if ("P".equals(jenis_kelamin)) {
                jk="Perempuan";
            }
            else if ("L".equals(jenis_kelamin)) {
                jk="Laki-laki";
            }
            else {
                jk="Jenis Kelamin Tidak Terdeteksi";
            }
            System.out.println(nama+" berasal dari kota "+nama_kota+" dan berjenis kelamin "+jk);
            System.out.println();
            
            
            }
            }
    }
    

