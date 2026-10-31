public class Domanda {
    private String domanda;
    private int valore;
    private Risposta [] risposte;
    private int rispostaData;
    public Domanda(String domanda,Risposta[]risposte){
        this.domanda=domanda;
        this.risposte=risposte;
        this.valore=1;
        this.rispostaData=0;
    }

    public Domanda (Domanda d){
        this.domanda=d.domanda;
        this.valore=d.valore;
    }
}
