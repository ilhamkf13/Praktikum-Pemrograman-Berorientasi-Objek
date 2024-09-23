package praktikum6;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara();
        kucing.makan("ikan");
        kucing.makan("ikan", 3);

        Hewan anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3);
    }
}