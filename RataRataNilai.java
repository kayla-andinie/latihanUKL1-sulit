import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Menginput nilai tiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai; // Menjumlahkan nilai
        }

        // Menghitung nilai rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n==============================");
        System.out.println("Total nilai   : " + totalNilai);
        System.out.println("Rata-rata nilai siswa: " + rataRata);
        System.out.println("==============================");
    }
}
