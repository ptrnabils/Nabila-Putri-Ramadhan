import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0; // Variabel untuk menyimpan jumlah nilai
        char pilihan;

        System.out.println("=== Program Menghitung Jumlah Nilai Mahasiswa ===");
        System.out.println(); // Baris kosong agar rapi

        do {
            // Input nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            // Menambahkan nilai yang baru diinput ke dalam total
            total += nilai;

            // Konfirmasi untuk menambah nilai lagi
            System.out.print("Ingin menambah nilai lagi? (y/t): ");
            pilihan = input.next().toLowerCase().charAt(0);
            System.out.println(); // Memberi jarak baris sesuai output di gambar

        } while (pilihan == 'y');

        // Menampilkan hasil akhir
        System.out.println("-----------------------------");
        System.out.println("Total nilai keseluruhan: " + total);

        input.close();
    }
}