package Tugas6;

abstract class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract double hitungDiskon();
}

class Buku extends Produk {
    private double diskonPersen; 

    public Buku(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskonPersen = diskonPersen / 100; 
    }

    @Override
    double hitungDiskon() {
        return harga * diskonPersen; 
    }
}

class Elektronik extends Produk {
    private double diskonPersen;

    public Elektronik(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskonPersen = diskonPersen / 100;
    }

    @Override
    double hitungDiskon() {
        return harga * diskonPersen;
    }
}

class Pakaian extends Produk {
    private double diskonPersen;

    public Pakaian(String nama, double harga, double diskonPersen) {
        super(nama, harga);
        this.diskonPersen = diskonPersen / 100;
    }

    @Override
    double hitungDiskon() {
        return harga * diskonPersen;
    }
}

class KeranjangBelanja {
    private Produk[] produkList;
    private int jumlahProduk;

    public KeranjangBelanja(int kapasitas) {
        produkList = new Produk[kapasitas];
        jumlahProduk = 0;
    }

    public void tambahProduk(Produk produk) {
        if (jumlahProduk < produkList.length) {
            produkList[jumlahProduk] = produk;
            jumlahProduk++;
        } else {
            System.out.println("Keranjang belanja penuh.");
        }
    }

    public double hitungTotalHarga() {
        double total = 0.0;
        for (int i = 0; i < jumlahProduk; i++) {
            double hargaSetelahDiskon = produkList[i].harga - produkList[i].hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(10);

        Produk buku1 = new Buku("Java Programming", 100000, 10); // 10%
        Produk elektronik1 = new Elektronik("Smartphone", 3000000, 50); // 50%
        Produk pakaian1 = new Pakaian("T-shirt", 50000, 20); // 20%

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        double totalHarga = keranjang.hitungTotalHarga();
        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}
