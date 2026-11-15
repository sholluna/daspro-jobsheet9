import java.util.Scanner;
import java.util.Arrays;
/**
 * tugas1NilaiMahasiswa25
 */
public class tugas1NilaiMahasiswa25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai mahasiswa: ");
        int n = sc.nextInt();
        while (n <= 0 ) {
            System.out.print("jumlah harus lebih dari 0, masukkan lagi: ");
            n = sc.nextInt();
        }
        int [] nilai = new int [n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai [i] = sc.nextInt();
            total += nilai[i];
        }
        int Rata2 = (int) total / n;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < n; i++) { 
        if (nilai[i] > tertinggi) tertinggi = nilai[i]; 
        if (nilai[i] < terendah) terendah = nilai[i];
        }
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        System.out.println("Rata rata : " + Rata2);
        System.out.println("Nilai tertinggi: " + tertinggi); 
        System.out.println("Nilai terendah: " + terendah);
    }
}