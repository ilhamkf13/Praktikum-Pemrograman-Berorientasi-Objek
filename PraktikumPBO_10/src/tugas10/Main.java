package tugas10;

public class Main {
    public static void main(String[] args){
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 1000000;
        double hargaMakanan = 200000;

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        System.out.println("Pajak elektronik: " + pajakElektronik);
        System.out.println("Pajak makanan: " + pajakMakanan);
    }
}
