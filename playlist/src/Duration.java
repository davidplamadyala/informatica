public class Duration {
    private int minuti;
    private int secondi;
    public Duration(int minuti, int secondi) {
        int tot = minuti * 60 + secondi;
        if (tot < 0) {
            tot = 0;
        }
        this.minuti = tot / 60;
        this.secondi = tot % 60;
    }
    public int getMinuti() {
        return minuti;
    }
    public int getSecondi() {
        return secondi;
    }
    public int totaleSecondi() {
        return minuti * 60 + secondi;
    }
    public Duration somma(Duration d) {
        return new Duration(0, this.totaleSecondi() + d.totaleSecondi());
    }
    @Override
    public String toString() {
        return minuti + " minuti e " + secondi + " secondi";
    }
}