package Praktikum05;
import java.util.Scanner;

public class LatihanIndividu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisKendaraan;
        int biayaPerJam = 0;
        int durasiParkir;
        
        // Meminta input jenis kendaraan dari pengguna
        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        jenisKendaraan = sc.next().toLowerCase(); // Menangani input agar tidak case-sensitive
        
        // Meminta input durasi parkir
        System.out.println("Berapa jam Anda akan parkir?");
        durasiParkir = sc.nextInt();
        
        // Menentukan biaya berdasarkan jenis kendaraan
        if (jenisKendaraan.equals("mobil")) {
            biayaPerJam = 5000;
        } else if (jenisKendaraan.equals("motor")) {
            biayaPerJam = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return;
        }

        // Menghitung total biaya
        int totalBiaya = biayaPerJam * durasiParkir;
        
        // Menampilkan hasil
        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp" + totalBiaya);
        
        sc.close();
    }
}