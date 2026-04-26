import java.util.Scanner;

public class P8_L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Nim : ");
            String nim = input.nextLine();

            System.out.println("Data: " + nama + " - " + nim);
            System.out.println();

            System.out.print("Apakah Anda ingin menginput data lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // supaya input berikutnya normal

            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        input.close();

    }

}
