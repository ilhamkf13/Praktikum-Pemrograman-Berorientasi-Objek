package praktikum11;

import java.util.ArrayList;
import java.util.List;

class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}

public class AgregasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Andi");
        Anggota anggota2 = new Anggota("Budi");

        Klub klub = new Klub("Klub Sepak Bola");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        klub.infoKlub();

        System.out.println("Anggota tetap ada:");
        anggota1.infoAnggota();
        anggota2.infoAnggota();
    }
}
