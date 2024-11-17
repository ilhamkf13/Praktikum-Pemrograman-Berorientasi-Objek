package praktikum11;

import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Perpustakaan:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }

    public void hapusPerpustakaan() {
        bukuList.clear();
        System.out.println("Perpustakaan dan semua buku telah dihapus.");
    }
}

public class KomposisiDemo {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
        perpustakaan.hapusPerpustakaan();
    }
}
