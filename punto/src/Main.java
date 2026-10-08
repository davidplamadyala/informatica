import java.util.Scanner;
private static Punto leggiPunto(Scanner in, String nome) {
    System.out.print("Coordinata x di " + nome + ": ");
    double x = in.nextDouble();
    System.out.print("Coordinata y di " + nome + ": ");
    double y = in.nextDouble();
    return new Punto(x, y);
}
public static void main(String[] args) {
    Punto p0 = new Punto();
    Punto p1 = new Punto(3, 4);
    Punto p2 = new Punto(p1);
    System.out.println("Costruttore vuoto: " + p0);
    System.out.println("Costruttore con parametri: " + p1);
    System.out.println("Costruttore di copia: " + p2);
    System.out.println("Distanza p0-p1: " + p0.distanza(p1));
    System.out.println("Punto medio p0-p1: " + p0.puntoMedio(p1));
    p1.ruota(90);
    System.out.println("p1 ruotato di 90 gradi: " + p1);
    System.out.println("p2 (copia) invariato: " + p2);
    Scanner in = new Scanner(System.in);
    Punto p = new Punto();
    int scelta;
    do {
        System.out.println("1. Imposta P con due coordinate");
        System.out.println("2. Reimposta P all'origine");
        System.out.println("3. Crea una copia di P");
        System.out.println("4. Distanza da un altro punto");
        System.out.println("5. Punto medio con un altro punto");
        System.out.println("6. Ruota P di un angolo (gradi)");
        System.out.println("7. Mostra P");
        System.out.println("0. Esci");
        System.out.print("Scelta: ");
        scelta = in.nextInt();
        switch (scelta) {
            case 1:
                p = leggiPunto(in, "P");
                break;
            case 2:
                p = new Punto();
                System.out.println("P = " + p);
                break;
            case 3:
                System.out.println("Copia di P: " + new Punto(p));
                break;
            case 4:
                Punto q = leggiPunto(in, "Q");
                System.out.println("Distanza P-Q: " + p.distanza(q));
                break;
            case 5:
                Punto r = leggiPunto(in, "Q");
                System.out.println("Punto medio P-Q: " + p.puntoMedio(r));
                break;
            case 6:
                System.out.print("Angolo in gradi: ");
                p.ruota(in.nextDouble());
                System.out.println("P dopo la rotazione: " + p);
                break;
            case 7:
                System.out.println("P = " + p);
                break;
            case 0:
                System.out.println("Arrivederci!");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
    } while (scelta != 0);
    in.close();
}

