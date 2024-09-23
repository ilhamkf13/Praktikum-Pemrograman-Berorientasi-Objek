package Tugas5;

public class HewanAir extends Hewan{
    String habitatAir;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Habitat Air : " + habitatAir);
    }
}
