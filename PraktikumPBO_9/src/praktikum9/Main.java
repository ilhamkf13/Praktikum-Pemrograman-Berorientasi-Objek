package praktikum9;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan kapal = new Kapal();

        mobil.berjalan();
        mobil.info();

        sepeda.berjalan();
        sepeda.info();

        kapal.berjalan();
        kapal.info();
    }
}