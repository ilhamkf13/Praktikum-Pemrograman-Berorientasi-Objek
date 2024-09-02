package Praktikum3;

//public class Main {
//    public static void main(String[] args) {
//        Hewan Kucing = new Hewan("Mimi", 3);
//        Kucing.suara();
//        Kucing.info();

//        Hewan Anjing = new Hewan("Anjing", 9);
//        Anjing.suara();
//        Anjing.info();
//       Anjing.berlari();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Nissan", "R34", 2002);
        Mobil mobil2 = new Mobil("Mitsubishi", "Galant V6", 1996);

        mobil1.displayInfo();
        mobil1.startEngine();
        mobil2.displayInfo();
        mobil2.startEngine();
        mobil1.setWarna("Hitam");
        mobil2.setWarna("Merah");
        System.out.println("\nSetelah mengubah warna:");
        mobil1.displayInfo();
        mobil2.displayInfo();
    }
}
