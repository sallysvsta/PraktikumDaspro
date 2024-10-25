import java.util.Scanner;
public class Pemilihan2Tugas1 {
    public static void main(String[] args) {
        Scanner sc19Scanner = new Scanner (System.in);
        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;
        int terbesar;

        System.out.println("Masukkan bil1 :");
        bil1 = sc19Scanner.nextInt();
        System.out.println("Masukkan bil2 :");
        bil2 = sc19Scanner.nextInt();
        System.out.println("Masukkan bil3 :");
        bil3 = sc19Scanner.nextInt();

        if (bil1 >= bil2 && bil1>= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        } 
        terbesar = (bil1 >= bil2) ? (bil1 >= bil3 ? bil1 : bil3) : (bil2 >= bil3 ? bil2 : bil3);

        System.out.println("Bilangan terbesar : " + terbesar);

        }
}

