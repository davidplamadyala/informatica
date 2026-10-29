package it.scuola.esercizi;

public class Rettangolo {
    private final double base;
    private final double altezza;
    public Rettangolo(double x1, double y1, double x2, double y2) {
        this.base = Math.abs(x2 - x1);
        this.altezza = Math.abs(y2 - y1);
    }
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }
    public double getArea() {
        return base * altezza;
    }
    public double getPerimetro() {
        return 2 * (base + altezza);
    }
}