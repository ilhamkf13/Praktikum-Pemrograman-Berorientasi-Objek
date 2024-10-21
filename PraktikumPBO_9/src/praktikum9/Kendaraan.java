package praktikum9;

abstract class Kendaraan {
    abstract void berjalan();

    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil berjalan dengan cepat");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda berjalan dengan pelan");
    }
}

class Kapal extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Kapal berjalan di laut");
    }
}