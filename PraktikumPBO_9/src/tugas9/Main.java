package tugas9;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        System.out.println("Kucing mengeluarkan suara:");
        kucing.suara();
        kucing.info();

        System.out.println("\nAnjing mengeluarkan suara:");
        anjing.suara();
        anjing.info();
    }
}
