import java.util.Scanner;

public class Tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int jumlahData = 0; // Variabel untuk menghitung berapa kali input
        char pilihan;

        System.out.println("=== Program Menghitung Rata-rata Nilai Mahasiswa ===");
        System.out.println();

        do {
            // Input nilai
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();

            // Akumulasi total dan jumlah data
            total += nilai;
            jumlahData++;

            // Konfirmasi
            System.out.print("Tambah nilai lagi? (y/t): ");
            pilihan = input.next().toLowerCase().charAt(0);
            System.out.println();

        } while (pilihan == 'y');

        // Menghitung rata-rata
        double rataRata = total / jumlahData;

        // Output hasil akhir sesuai format gambar
        System.out.println("--- Hasil Akhir ---");
        System.out.println("Banyaknya nilai : " + jumlahData);
        System.out.println("Total nilai     : " + total);
        System.out.println("Rata-rata nilai : " + rataRata);

        input.close();
    }
}