public class Quiz {
    private Domanda[] domande;
    private int totPunteggio;
    private int tuoPunteggio;
    private String titolo;
    private int numeroDomande = 0;
    private final int maxDomande = 100;

    public Quiz(String t) {
        titolo = t;
        this.domande = new Domanda[maxDomande];
    }
    public Quiz (Quiz q){
        this.titolo = q.titolo;
        this.numeroDomande = q.numeroDomande;
        this.domande = new Domanda[maxDomande];
        for (int i = 0; i < q.numeroDomande; i++) {
            this.domande[i] = new Domanda(q.domande[i]);
        }
    }
    public void add (Domanda d){
        if (numeroDomande < maxDomande) {
            domande[numeroDomande] = d;
            numeroDomande ++;
        }
    }
    public int getQuanteDomande() {
        return numeroDomande;
    }
    public int getQuanteRisposte(){
        int a = 0;
        for (int i = 0; i < numeroDomande; i++) {
            if(domande[i].completata()){
                a ++;
            }
        }
        return a;
    }
    public int[] getDomandeNonDate(){
        int contatore = 0;
        for (int i = 0; i < numeroDomande; i++) {
            if (!domande[i].completata()) {
                contatore++;
            }
        }
        int[] a;
        a = new int[contatore];
        int b = 0;
        for (int i = 0; i < numeroDomande; i++) {
            if(!domande[i].completata()){
                a[b] = (i + 1);
                b++;
            }
        }
        return a;
    }

    public Domanda getDomanda(int i) {
        if (i >= 1 && i <= numeroDomande) {
            return domande[i - 1];
        }
        return null;
    }
    public int getTotale() {
        totPunteggio = 0;
        for (int i = 0; i < numeroDomande; i++) {
            totPunteggio += domande[i].getValore();
        }
        return totPunteggio;
    }
    public int getPunteggio() {
        tuoPunteggio = 0;
        for (int i = 0; i < numeroDomande; i++) {
            int p = domande[i].getPunteggio();
            if (p > 0) {
                tuoPunteggio += p;
            }
        }
        return tuoPunteggio;
    }
    @Override
    public String toString() {
        return "Quiz: " + titolo + "\nNumero domande: " + getQuanteDomande() + "\nPunteggio totale: " + getTotale() + " punti";
    }
}