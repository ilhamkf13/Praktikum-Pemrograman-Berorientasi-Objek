package Tugas5;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Moka";
        kucing.jenis = "British Short Hair";
        kucing.habitatDarat = "Darat";
        kucing.tampilkanInfo();

        Anjing anjing = new Anjing();
        anjing.nama = "Nemo";
        anjing.jenis = "Clown Fish";
        anjing.habitatDarat = "Darat";
        anjing.tampilkanInfo();
    }
}
