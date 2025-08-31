package main.java.skladniki;

public enum Kawy {
    ESPRESSO(1, 2,0),
    CAPPUCCINO(0, 1,2),
    AMERICANO(2, 2,0),
    BRAK(0,0,0),
    MLEKO(0,0,3);

    private final int woda;
    private final int kawa;
    private final int mleko;

    Kawy(int woda, int kawa, int mleko) {
        this.woda = woda;
        this.kawa = kawa;
        this.mleko = mleko;
    }

    public int getMleko() {
        return mleko;
    }

    public int getWoda() {
        return woda;
    }

    public int getKawa() {
        return kawa;
    }
}
