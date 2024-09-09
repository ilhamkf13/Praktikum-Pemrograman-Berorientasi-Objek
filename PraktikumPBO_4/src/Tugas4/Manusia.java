package Tugas4;

public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;

    public Manusia (String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia (int usia) {
        this.usia = usia;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan (String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}

