package tugas10;

public class Elektronik implements Pembayaran{
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1;
    }
}
