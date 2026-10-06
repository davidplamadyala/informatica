public class GeneratoreAutoIncrementale {
    private String parteAlfanumerica;
    private int nCifre;
    private int contatore = 0;
    private String parteNumerica;
    public GeneratoreAutoIncrementale (String parteAlfanumerica, int nCifre){
        this.parteAlfanumerica = parteAlfanumerica;
        this.nCifre = nCifre;
        this.contatore = 0;
    }
    public String getParteAlfanumerica() {
        return parteAlfanumerica;
    }
    public void setParteAlfanumerica(String parteAlfanumerica) {
        this.parteAlfanumerica = parteAlfanumerica;
    }
    public int getnCifre() {
        return nCifre;
    }
    public void setnCifre(int nCifre) {
        this.nCifre = nCifre;
    }
    public String genera () {
        String codice = "" + this.contatore;
        int zeriAggiunti = this.nCifre - codice.length();
        String zeri = "";
        for (int i = 0; i < zeriAggiunti; i++) {
            zeri = zeri + "0";
        }
        this.parteNumerica = zeri + this.contatore;
        String codiceCompleto = this.parteAlfanumerica + this.parteNumerica;
        this.contatore ++;
        return codiceCompleto;
    }
    @Override
    public String toString() {
        return "Codice {Prefisso: " + parteAlfanumerica +
                ", ultimo valore generato: " + parteNumerica + "}";
    }
}