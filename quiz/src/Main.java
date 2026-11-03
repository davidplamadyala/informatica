import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_RISPOSTE = 4;
        Quiz q;
        Domanda d;
        String domanda, titolo;
        int scelta = 1;
        System.out.println("Inserisci il titolo del quiz: ");
        titolo = in.nextLine();
        q = new Quiz(titolo);
        do {
            System.out.println("Inserisci il testo della domanda: ");
            domanda = in.nextLine();
            System.out.println("Quale sarà il numero della risposta corretta (1-4)? ");
            int indiceCorretta = in.nextInt();
            in.nextLine();
            Risposta[] r = new Risposta[MAX_RISPOSTE];
            for (int i = 0; i < MAX_RISPOSTE; i++) {
                System.out.println("Inserisci il testo della risposta " + (i + 1) + ": ");
                String testoRisposta = in.nextLine();
                boolean esito = false;
                if (i + 1 == indiceCorretta){
                    esito = true;
                }
                r[i] = new Risposta(i + 1, testoRisposta, esito);
            }
            d = new Domanda(domanda, r);
            System.out.println("Inserisci il valore della domanda (punti): ");
            int valore = in.nextInt();
            d.setValore(valore);
            q.add(d);
            System.out.println("Premere 1 per aggiungere un'altra domanda, 0 per finire: ");
            scelta = in.nextInt();
        } while(scelta != 0);
        System.out.println("--- AVVIO DEL QUIZ: " + titolo + " ---");
        for (int i = 1; i <= q.getQuanteDomande(); i++) {
            Domanda corrente = q.getDomanda(i);
            System.out.println("Domanda " + i + ": " + corrente.toString());
            System.out.println("La tua risposta (1-4): ");
            int sceltaUtente = in.nextInt();

            if (corrente.rispondi(sceltaUtente)) {
                System.out.println("Esatto!");
            } else {
                System.out.println("Sbagliato! La risposta corretta era: " + corrente.getRispostaCorretta());
            }
        }
        System.out.println("" + q);
        System.out.println("Punteggio ottenuto: " + q.getPunteggio() + "/" + q.getTotale());
    }
}