import java.util.Scanner;
public class Pemilihan2Percobaan119 {
    public static void main(String[] args) {
        Scanner sc19Scanner = new Scanner (System.in);
        int tahunkabisat;

        System.out.print("Masukkan tahun: ");
        tahunkabisat = sc19Scanner.nextInt();

            if (tahunkabisat % 400 == 0) {
                    System.out.println("Tahun Kabisat");
            } else {
               if (tahunkabisat % 100 == 0) {
                    System.out.println("Bukan Tahun Kabisat");
            } else {
                if (tahunkabisat % 4 == 0) {
                System.out.println("Tahun Kabisat");
            } else {
            System.out.println("Bukan Tahun Kabisat");
            }
            }
        }
    } 
    }
