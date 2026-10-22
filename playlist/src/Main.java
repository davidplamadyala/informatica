import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Playlist p = new Playlist("Rock anni sessanta", new Canzone[0]);
        int s;
        do {
            System.out.println("\n1 Aggiungi canzone  2 Mostra canzone  3 PLAY  4 PAUSE  5 STOP  6 Successivo  7 Precedente  8 Durata totale  0 Esci");
            s = in.nextInt();
            in.nextLine();
            if (s == 1) {
                System.out.print("Titolo: ");
                String t = in.nextLine();
                System.out.print("Artista: ");
                String a = in.nextLine();
                System.out.print("Minuti e secondi: ");
                p.add(new Canzone(t, new Duration(in.nextInt(), in.nextInt()), a));
            } else if (s == 2) {
                System.out.print("Numero: ");
                System.out.println(p.getCanzone(in.nextInt()));
            } else if (s == 3) p.play();
            else if (s == 4) p.pause();
            else if (s == 5) p.stop();
            else if (s == 6) p.branoSuccessivo();
            else if (s == 7) p.branoPrecedente();
            else if (s == 8) System.out.println(p.durataTotale());
            if (s >= 3 && s <= 7) System.out.println(p);
        } while (s != 0);
    }
}