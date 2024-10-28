package praktikum10;

public class Main {
    public static void main (String [] args) {
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Hasil penjumlahan: " + penjumlahan.hitung(10, 5));

        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Hasil pengurangan: " + pengurangan.hitung(10, 5));
    }
}