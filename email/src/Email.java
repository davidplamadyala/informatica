public class Email {
    private String indirizzo;
    public Email(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getDominio() {
        String dominio = "";
        boolean dopoChiocciola = false;
        for (int i = 0; i < indirizzo.length(); i++) {
            char c = indirizzo.charAt(i);
            if (dopoChiocciola) {
                dominio = dominio + c;
            }
            if (c == '@') {
                dopoChiocciola = true;
            }
        }
        return dominio;
    }
    public String getDominioPrimoLivello() {
        String dominio = getDominio();
        String primoLivello = "";
        for (int i = 0; i < dominio.length(); i++) {
            char c = dominio.charAt(i);
            if (c == '.') {
                primoLivello = "";
            } else {
                primoLivello = primoLivello + c;
            }
        }
        return primoLivello;
    }
}