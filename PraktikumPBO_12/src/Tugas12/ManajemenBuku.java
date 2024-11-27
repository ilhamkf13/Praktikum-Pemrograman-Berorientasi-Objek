package Tugas12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }

    @Override
    public String toString() {
        return judul + "," + pengarang + "," + tahunTerbit;
    }

    public static Buku fromString(String data) {
        String[] bagian = data.split(",");
        return new Buku(bagian[0], bagian[1], Integer.parseInt(bagian[2]));
    }
}

public class ManajemenBuku {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        muatDariFileSerial();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serialisasi");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 : tambahBuku(scanner);
                case 2 : simpanKeFileTeks();
                case 3 : simpanKeFileSerial();
                case 4 : tampilkanDariFileTeks();
                case 5 : tampilkanDariFileSerial();
                case 6 : {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default : System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Buku buku : daftarBuku) {
                writer.write(buku.toString());
                writer.newLine();
            }
            System.out.println("Data buku berhasil disimpan ke file teks: " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek buku berhasil disimpan ke file serial: " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileTeks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            System.out.println("\nDaftar Buku dari File Teks:");
            while ((line = reader.readLine()) != null) {
                Buku buku = Buku.fromString(line);
                buku.tampilkanInfo();
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca dari file teks.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileSerial() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia dari file serial.");
            return;
        }
        System.out.println("\nDaftar Buku dari File Serialisasi:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
        }
    }

    @SuppressWarnings("unchecked")
    private static void muatDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            daftarBuku = (List<Buku>) ois.readObject();
            System.out.println("Data buku berhasil dimuat dari file serial.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak ada data buku sebelumnya atau file tidak ditemukan.");
        }
    }
}
