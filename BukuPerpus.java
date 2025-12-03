/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukuperpus;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;

public class BukuPerpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama Peminjam: ");
        String nama = input.nextLine();
        
        System.out.println("Judul Buku: ");
        String judulBuku = input.nextLine();
        
        System.out.println("Kategori Buku (A/B/C): ");
        char kategori = input.next().toUpperCase().charAt(0);
        
        System.out.println("Lama peminjaman (hari): ");
        int hari = input.nextInt();
        
        int tarif;
        if(kategori == 'A'){
            tarif = 2000;
        }else if(kategori == 'B'){
            tarif = 1500;
        }else if(kategori == 'C'){
            tarif = 1000;
        }else{
            System.out.println("Kategori tidak valid");
            return;
        }
        
        int biayaAwal = tarif * hari; 
        
        int denda = 0; 
        if (hari > 7) { 
            int terlambat = hari - 7; 
            denda = terlambat * 500; 
        } 
        
        int total = biayaAwal + denda;
        
        System.out.println("Nama peminjam: " + nama);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Kategori Buku: " + kategori);
        System.out.println("Lama Peminjaman: " + hari);
        System.out.println("Biaya Peminjaman Awal: " + biayaAwal);
        System.out.println("Denda Keterlambatan: " + denda);
        System.out.println("Total Biaya Akhir: " + total);
    }
}

