public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codiceConto;
    private double saldo;
    public ContoCorrente (String nome, String cognome, String codiceConto){
        this.nome=nome;
        this.cognome=cognome;
        this.codiceConto=codiceConto;
    }
    public double preleva(double soldi){
        if (soldi<0){
            return saldo;
        }else if(saldo-soldi<0){
            return saldo;
        }
        saldo-=soldi;
        return saldo;
    }
    public double deposita(double deposito){
        if(deposito<0){
            return saldo;
        }
        saldo+=deposito;
        return saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getCodice(){
        return codiceConto;
    }
    public String getNominativo(){
        return nome + " " + cognome;
    }
    @Override
    public String toString(){
        return "Nome e cognome del correntista: " + nome + " " + cognome + " , codice univoco del conto: " + codiceConto + " , saldo: " + saldo + " euro";
    }
}
