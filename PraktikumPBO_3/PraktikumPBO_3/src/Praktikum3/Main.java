package Praktikum3;

public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Hewan("Mimi", 3);
        Kucing.suara();
        Kucing.info();

        Hewan Anjing = new Hewan("Anjing", 9);
        Anjing.suara();
        Anjing.info();
        Anjing.berlari();
    }
}