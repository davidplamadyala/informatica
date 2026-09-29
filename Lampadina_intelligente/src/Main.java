public class Main {
    public static void main(String[] args) {
        Lampadina lamp1= new Lampadina(60);
        lamp1.getNome("Cucina");
        System.out.println("Nome della lampadina: ");
        System.out.println(lamp1.getNome());
        lamp1.accendi();
        System.out.println(lamp1);

        lamp1.aumenta_luminosita();
        lamp1.aumenta_luminosita();
        lamp1.aumenta_luminosita();
        System.out.println(lamp1);
        lamp1.diminuisci_luminosita();
        System.out.println(lamp1);
        lamp1.spegni();
        System.out.println(lamp1);

        Lampadina lamp2 = new Lampadina(lamp1);
        System.out.println("Lampadina copiata: ");
        System.out.println(lamp2);

        Lampadina lamp3 = new Lampadina(200);
        System.out.println("Lampadina con potenza non valida: ");
        System.out.println(lamp3);
        }
    }
