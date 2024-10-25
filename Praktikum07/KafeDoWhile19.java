package Praktikum07;
import java.util.Scanner;
public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc19Scanner = new Scanner (System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        // sc19Scanner.nextInt();
        // sc19Scanner.nextLine();
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc19Scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc19Scanner.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc19Scanner.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc19Scanner.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc19Scanner.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai. ");
            }
        }
    

