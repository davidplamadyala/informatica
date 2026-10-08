public class Punto {
    private double x;
    private double y;
    public Punto() {
        this(0, 0);
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto(Punto altro) {
        this(altro.x, altro.y);
    }
    public double distanza(Punto altro) {
        double dx = x - altro.x;
        double dy = y - altro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public Punto puntoMedio(Punto altro) {
        return new Punto((x + altro.x) / 2, (y + altro.y) / 2);
    }
    public void ruota(double alpha) {
        double rad = Math.toRadians(alpha);
        double nuovaX = x * Math.cos(rad) - y * Math.sin(rad);
        double nuovaY = x * Math.sin(rad) + y * Math.cos(rad);
        x = nuovaX;
        y = nuovaY;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}