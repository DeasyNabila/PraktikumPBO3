/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Kendaraan {
    //Deklarasi variabel dan nilai
    String jenis, brand, warna;
    int cc, tahun_keluaran;
    
    void spesifikasi (){
        Scanner input = new Scanner (System.in);
        //isi dari program
        System.out.println("Masukkan jenis kendaraan :");
        jenis = input.nextLine();
        System.out.println("Masukkan nama brand :");
        brand = input.nextLine();
        System.out.println("Masukkan warna kendaraan :");
        warna = input.nextLine();
        System.out.println("Masukkan cc kendaraan :");
        cc = input.nextInt();
        System.out.println("Masukkan tahun keluaran :");
        tahun_keluaran = input.nextInt();
               
}
    void tampil (){
        
        //Menampilkan program
        System.out.println("");
        System.out.println("Jenis kendaraan : " + jenis);
        System.out.println("Nama Brand : " + brand);
        System.out.println("Warna Kendaraan : " + warna);
        System.out.println("cc Kendaraan : " + cc);
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        
    }

    

}
