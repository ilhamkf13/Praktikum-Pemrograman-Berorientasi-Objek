package Tugas4;

public class Pekerja extends Manusia {
    private double gaji;
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + getUsia() + "\n" +
               "Pekerjaan: " + getPekerjaan() + "\n" +
               "Gaji: " + gaji;
    }
}

