public class Playlist {
    public static final int MAX_CANZONI = 100;
    private String nome;
    private int nBrani;
    private String stato;
    private int brano = 1;
    private Canzone[] canzoni;
    public Playlist(String nome, Canzone[] canzoni) {
        this.nome = nome;
        this.canzoni = new Canzone[MAX_CANZONI];
        this.nBrani = 0;
        if (canzoni != null) {
            for (int i = 0; i < canzoni.length && this.nBrani < MAX_CANZONI; i++) {
                if (canzoni[i] != null) {
                    this.canzoni[this.nBrani] = canzoni[i];
                    this.nBrani++;
                }
            }
        }
        this.stato = "STOP";
    }
    public Playlist(Playlist p) {
        this.nome = p.nome;
        this.nBrani = p.nBrani;
        this.stato = p.stato;
        this.brano = p.brano;
        this.canzoni = new Canzone[MAX_CANZONI];
        for (int i = 0; i < p.nBrani; i++) {
            this.canzoni[i] = p.canzoni[i];
        }
    }
    public String getNome() { return nome; }
    public int getnBrani() { return nBrani; }
    public void play() { this.stato = "PLAY"; }
    public void pause() {
        if (!(this.stato.equals("STOP"))) {
            this.stato = "PAUSE";
        }
    }
    public void stop() {
        if (this.stato.equals("STOP")) {
            this.brano = 1;
        } else {
            this.stato = "STOP";
        }
    }
    public void branoSuccessivo() {
        this.brano++;
        if (this.brano > this.nBrani) {
            this.brano = this.nBrani;
        }
    }
    public void branoPrecedente() {
        this.brano--;
        if (this.brano < 1) {
            this.brano = 1;
        }
    }
    public Canzone getCanzone(int n) {
        if (n < 1 || n > nBrani) {
            return null;
        }
        return canzoni[n - 1];
    }
    public boolean add(Canzone c) {
        if (nBrani >= MAX_CANZONI) {
            return false;
        }
        canzoni[nBrani] = c;
        nBrani++;
        return true;
    }
    public Duration durataTotale() {
        Duration totale = new Duration(0, 0);
        for (int i = 0; i < nBrani; i++) {
            totale = totale.somma(canzoni[i].getDurata());
        }
        return totale;
    }
    @Override
    public String toString() {
        String s = "Playlist " + nome + ", " + nBrani + " brani, in " + stato;
        Canzone c = getCanzone(brano);
        if (c != null) {
            s += " sul brano\n" + c.getTitolo() + " di " + c.getArtista();
        }
        return s;
    }
}