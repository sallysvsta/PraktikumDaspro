package Praktikum05;
import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia = -1; // Inisialisasi variabel usia dengan nilai negatif untuk validasi
        
        // Meminta input dari pengguna dengan validasi
        while (usia < 0) {
            System.out.println("Masukkan usia Anda: ");
            
            // Memeriksa apakah input adalah angka
            if (sc.hasNextInt()) {
                usia = sc.nextInt();
                
                // Memastikan input adalah angka positif
                if (usia < 0) {
                    System.out.println("Usia tidak boleh negatif. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka positif.");
                sc.next(); // Membersihkan input yang tidak valid
            }
        }
        
        // Menentukan kategori usia
        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori usia: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori usia: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori usia: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Kategori usia: Lansia");
        }

        sc.close();
    }
}