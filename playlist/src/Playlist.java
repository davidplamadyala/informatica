public class Playlist {
    private String nome;
    private int nBrani;
    private String stato;
    private int brano = 1;
    public Playlist(String nome, int nBrani){
        this.nome = nome;
        this.nBrani = nBrani;
        this.stato = "STOP";
    }
    public Playlist(Playlist p){
        this.nome = p.nome;
        this.nBrani = p.nBrani;
        this.stato = p.stato;
        this.brano = p.brano;
    }
    public String getNome() {
        return nome;
    }
    public int getnBrani() {
        return nBrani;
    }
    public void play () {
        this.stato = "PLAY";
    }
    public void pause () {
        if (!(this.stato.equals("STOP"))) {
            this.stato = "PAUSE";
        }
    }
    public void stop () {
        if(this.stato.equals("STOP")){
            this.brano = 1;
        }
        else{
            this.stato = "STOP";
        }
    }
    public void branoSuccessivo () {
        this.brano ++;
        if (this.brano > this.nBrani){
            this.brano = this.nBrani;
        }
    }
    public void branoPrecedente () {
        this.brano --;
        if (this.brano < 1){
            this.brano = 1;
        }
    }
    @Override
    public String toString (){
        return "Playlist: " + nome +
                "\nTotale brani: " + nBrani +
                "\nStato: " + stato +
                "\nBrano in ascolto: " + brano;
    }
}