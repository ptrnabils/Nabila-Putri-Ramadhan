import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Input nilai
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            // Menampilkan kembali nilai yang diinput
            System.out.println("Nilai yang diinput: " + nilai);

            // Menanyakan apakah ingin mengulang
            System.out.print("Ulangi input? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        // Menampilkan pesan saat program berakhir
        System.out.println("Program selesai.");

        input.close();
    }
}