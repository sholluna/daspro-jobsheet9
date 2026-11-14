public class SearchNilai25 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 100; // coba ganti: 90 (ada) atau 100 (tidak ada)
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key
                    + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
        }
    }
}