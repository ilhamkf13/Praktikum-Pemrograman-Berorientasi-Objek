package Praktikum5;

class Kendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan " + kecepatan + "km/jam");
    }
}

class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }
}

class KendaraanLaut extends Kendaraan {
    int jumlahPropeler;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Propeler : " + jumlahPropeler);
    }
}

class Mobil extends KendaraanDarat { 
    int jumlahPintu; 
 
    @Override 
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu); 
    }  
}

class SepedaMotor extends KendaraanDarat { 
    String jenisMesin; 
 
    @Override 
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Jenis Mesin: " + jenisMesin); 
    } 
} 

class Kapal extends KendaraanLaut { 
    int jumlahPenumpang; 
 
    @Override 
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang); 
    } 
}

public class Main { 
    public static void main(String[] args) { 
        Mobil mobil = new Mobil(); 
        mobil.nama = "Mitsubishi";
        mobil.jumlahRoda = 4; 
        mobil.kecepatan = 210; 
        mobil.jumlahPintu = 2; 
        mobil.tampilkanInfo();
 
        SepedaMotor motor = new SepedaMotor(); 
        motor.nama = "Yamaha";
        motor.jumlahRoda = 2; 
        motor.kecepatan = 100; 
        motor.jenisMesin = "Win-100"; 
        motor.tampilkanInfo(); 

        Kapal kapal = new Kapal();
        kapal.nama = "Kapal Lawut";
        kapal.kecepatan = 50;
        kapal.jumlahPropeler = 2;
        kapal.jumlahPenumpang = 2;
        kapal.tampilkanInfo();
    } 
}