import java.util.Scanner;
/**
 * tugas2kafe25
 */
public class tugas2kafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi goreng", "Mie goreng", "Roti bakar", "Kentang goreng", "Teh tarik", "Cappuccino", "Chocolate ice"};
        int[] harga = {15000,13000,10000,12000,8000,18000,20000};
        System.out.print("Jumlah jenis pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String [jumlahPesanan];
        int[] jumlahItem = new int[jumlahPesanan];
        int[]subtotal = new int[jumlahPesanan];
        int total = 0;
        for (int i = 0; i < jumlahPesanan;i++) {
            int posisi = -1;
            while (posisi == -1) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = sc.nextLine();
                for (int j = 0; j < menu.length;j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        posisi = j;
                        break;
                    }
                }
                if (posisi == -1) {
                    System.out.println("menu tidak tersedia.masukkan menu yang valid");
                }
            }
            System.out.println("Menu ditemukan: " + menu[posisi] + " -Rp" + harga[posisi]);
            namaPesanan[i] = menu[posisi];
            System.out.print("Masukkan jumlah " + namaPesanan[i] + ": ");
            jumlahItem[i] = sc.nextInt();
            subtotal[i] = harga[posisi] * jumlahItem[i];
            total += subtotal[i];
        }
        System.out.println("=== daftar nama pesanan ===");
        for (int i = 0;i < jumlahPesanan;i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " | jumlah: " + jumlahItem[i] + " | subtotal: Rp" + subtotal[i]);
        }
        System.out.println("total biaya: Rp" + total);
    }
}