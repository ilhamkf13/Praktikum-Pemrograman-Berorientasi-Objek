package Tugas4;

public class Main {
    public static void main(String[] args) {
        Pekerja pekerja = new Pekerja("Budi", 25, "PNS", 5000000);
        System.out.println("Informasi Pekerja Awal :");
        System.out.println(pekerja.toString());
    
    pekerja.setNama("Tupac");

    System.out.println("\nInformasi Pekerja Setelah Diubah :");
    System.out.println(pekerja.toString());

    System.out.println("\nCoba Akses Langsung Atribut : ");

    System.out.println("Nama (via getter): " + pekerja.getNama());
    System.out.println("Usia (via getter): " + pekerja.getUsia());
    System.out.println("Gaji (via getter): " + pekerja.getGaji());
    }
}
