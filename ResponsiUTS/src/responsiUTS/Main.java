package responsiUTS;

public class Main {
    public static void main(String[] args) {
        //output produk
        Produk produk1 = new Elektronik("Iphone", 13000000, 1);
        produk1.tampilkanInfo();
        System.out.println();

        //output pegawai
        Pegawai pegawai1 = new PegawaiTetap("Ilham", 8000000, 1500000);
        pegawai1.tampilkanInfo();
        System.out.println();

        //output polimorfisme
        Produk produk2 = new Makanan("Kopi", 25000, "2024-12-30");
        produk2.tampilkanInfo();
        System.out.println();
        Pegawai pegawai2 = new PegawaiKontrak("Kukuh", 4500000, 24);
        pegawai2.tampilkanInfo();
    }
}