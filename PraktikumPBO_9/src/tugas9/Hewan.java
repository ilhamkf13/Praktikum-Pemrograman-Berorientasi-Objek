package tugas9;

abstract class Hewan {
    abstract void suara();

    void info() {
        System.out.println("Hewan ini adalah hewan peliharaan");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk");
    }
}
