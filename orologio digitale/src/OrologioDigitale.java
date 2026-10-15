public class OrologioDigitale {

    // Stato dell'orologio: 1 = normale, 2 = impostaOrario, 3 = impostaSveglia
    private int stato;

    // Quando siamo nello stato 2 o 3: true = si regolano le ore, false = si regolano i minuti
    private boolean regolaOre;

    // Orario corrente
    private int ore;
    private int minuti;

    // Sveglia
    private int oreSveglia;
    private int minutiSveglia;
    private boolean svegliaAttiva;

    // Costruttore vuoto: orario 00:00, sveglia 00:00 non attiva
    public OrologioDigitale() {
        this.ore = 0;
        this.minuti = 0;
        this.oreSveglia = 0;
        this.minutiSveglia = 0;
        this.svegliaAttiva = false;
        this.stato = 1;          // si parte nello stato normale
        this.regolaOre = true;   // se si entra in regolazione, si parte dalle ore
    }

    // Costruttore con ore e minuti: se i valori non sono validi, orario a 00:00
    public OrologioDigitale(int ore, int minuti) {
        // Prima imposto tutto come nel costruttore vuoto...
        this();
        // ...poi, solo se i valori sono validi, cambio l'orario
        if (ore >= 0 && ore <= 23 && minuti >= 0 && minuti <= 59) {
            this.ore = ore;
            this.minuti = minuti;
        }
    }

    // Tasto SET (orario): da 1 o 3 passa a 2, da 2 torna a 1
    public void impostaOrario() {
        if (stato == 2) {
            stato = 1;
        } else {
            stato = 2;
            regolaOre = true; // si parte sempre regolando le ore
        }
    }

    // Come sopra, ma per la sveglia (stato 3)
    public void impostaSveglia() {
        if (stato == 3) {
            stato = 1;
        } else {
            stato = 3;
            regolaOre = true;
        }
    }

    // Attiva la sveglia se è disattiva, e viceversa
    public void toggleSveglia() {
        svegliaAttiva = !svegliaAttiva;
    }

    // Tasto +
    public void aumenta() {
        if (stato == 2) {
            if (regolaOre) {
                ore = (ore + 1) % 24;       // dopo 23 si torna a 0
            } else {
                minuti = (minuti + 1) % 60; // dopo 59 si torna a 0
            }
        } else if (stato == 3) {
            if (regolaOre) {
                oreSveglia = (oreSveglia + 1) % 24;
            } else {
                minutiSveglia = (minutiSveglia + 1) % 60;
            }
        }
        // nello stato 1 non succede niente
    }

    // Tasto -
    public void diminuisci() {
        if (stato == 2) {
            if (regolaOre) {
                ore = (ore + 23) % 24;       // da 0 si va a 23
            } else {
                minuti = (minuti + 59) % 60; // da 0 si va a 59
            }
        } else if (stato == 3) {
            if (regolaOre) {
                oreSveglia = (oreSveglia + 23) % 24;
            } else {
                minutiSveglia = (minutiSveglia + 59) % 60;
            }
        }
        // nello stato 1 non succede niente
    }

    // Tasto play/pausa: passa da ore a minuti e viceversa (solo negli stati 2 e 3)
    public void toggleOreMinuti() {
        if (stato == 2 || stato == 3) {
            regolaOre = !regolaOre;
        }
    }

    @Override
    public String toString() {
        String risultato = "Orologio in modalità " + stato;

        if (stato == 2 || stato == 3) {
            if (regolaOre) {
                risultato += ", regolazione ore.";
            } else {
                risultato += ", regolazione minuti.";
            }
        } else {
            risultato += ".";
        }

        // %02d scrive il numero su almeno 2 cifre, aggiungendo uno 0 davanti (es. 8 -> 08)
        risultato += "\nOrario corrente " + String.format("%02d:%02d", ore, minuti);
        risultato += "\nSveglia corrente " + String.format("%02d:%02d", oreSveglia, minutiSveglia);

        if (svegliaAttiva) {
            risultato += ", attiva";
        } else {
            risultato += ", non attiva";
        }

        return risultato;
    }

    // Piccolo main per provare la classe (puoi toglierlo o metterlo in un'altra classe)
    public static void main(String[] args) {
        OrologioDigitale o = new OrologioDigitale(13, 26);
        System.out.println(o);
        System.out.println();

        // Imposto la sveglia alle 08:30 e la attivo
        o.impostaSveglia();       // stato 3, regolazione ore
        for (int i = 0; i < 8; i++) {
            o.aumenta();
        }
        o.toggleOreMinuti();      // ora regolo i minuti
        for (int i = 0; i < 30; i++) {
            o.aumenta();
        }
        o.impostaSveglia();       // torno allo stato 1
        o.toggleSveglia();        // sveglia attiva
        System.out.println(o);
        System.out.println();

        // Entro in regolazione orario, passo ai minuti
        o.impostaOrario();
        o.toggleOreMinuti();
        System.out.println(o);
    }
}
