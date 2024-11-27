package Praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Produk untuk Serialisasi
class Produk implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }

    @Override
    public String toString() {
        return "Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
    }
}

public class InventorySystem {
    private static final String TEXT_FILE = "produk.txt";
    private static final String SERIAL_FILE = "produk.ser";
    private static List<Produk> produkList = new ArrayList<>();

    public static void main(String[] args) {
        // Memuat data dari file serialisasi saat program dimulai
        muatDariFileSerial();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer setelah nextInt()

            switch (pilihan) {
                case 1 : tambahProduk(scanner);
                case 2 : simpanKeFileTeks();
                case 3 : simpanKeFileSerial();
                case 4 : tampilkanProduk();
                case 5 : {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default : System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahProduk(Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        produkList.add(new Produk(nama, harga, stok));
        System.out.println("Produk berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Produk produk : produkList) {
                writer.write(produk.toString() + "\n");
            }
            System.out.println("Data produk berhasil disimpan ke file teks: " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(produkList);
            System.out.println("Objek produk berhasil disimpan ke file serial: " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void muatDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            produkList = (List<Produk>) ois.readObject();
            System.out.println("Data produk berhasil dimuat dari file serial.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak ada data produk sebelumnya atau file tidak ditemukan.");
        }
    }

    private static void tampilkanProduk() {
        if (produkList.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia.");
            return;
        }

        System.out.println("Daftar Produk:");
        for (Produk produk : produkList) {
            produk.tampilkanInfo();
            System.out.println("----------------------");
        }
    }
}
