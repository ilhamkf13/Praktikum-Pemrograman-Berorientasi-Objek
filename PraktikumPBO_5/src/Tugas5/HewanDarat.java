package Tugas5;

public class HewanDarat extends Hewan{
    String habitatDarat;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Habitat Darat : " + habitatDarat);
    }
}
