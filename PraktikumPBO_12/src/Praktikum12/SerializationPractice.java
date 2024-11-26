package Praktikum12;

import java.io.*;

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
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";
        Produk produk = new Produk("Laptop", 15000000, 10);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek produk berhasil disimpan ke file: " + filePath);
        } 
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek: ");
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializeProduk = (Produk) ois.readObject();
            System.out.println("\nObjek produk yang dibaca dari file: ");
            deserializeProduk.tampilkanInfo();
        } 
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek dari file: ");
            e.printStackTrace();
        }
    }
}