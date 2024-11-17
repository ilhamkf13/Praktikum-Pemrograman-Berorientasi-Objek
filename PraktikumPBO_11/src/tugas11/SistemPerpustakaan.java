package tugas11;

import java.util.ArrayList;
import java.util.List;

class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang; 

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();
        }
    }
}

class Perpustakaan {
    private List<Buku> daftarBuku; 

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Perpustakaan:");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }

    public void hapusPerpustakaan() {
        daftarBuku.clear();
        System.out.println("Perpustakaan dan semua buku telah dihapus.");
    }
}

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");

        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("Game of Thrones", pengarang2);
        Buku buku3 = new Buku("Buku Tanpa Pengarang", null);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.infoPerpustakaan();

        perpustakaan.hapusPerpustakaan();
    }
}

