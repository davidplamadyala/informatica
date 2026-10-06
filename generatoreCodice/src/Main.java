import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner in = new Scanner(System.in);
        GeneratoreAutoIncrementale g = new GeneratoreAutoIncrementale("ADH", 4);
        System.out.println("Inserisci il prefisso: ");
        String s = in.next();
        g.setParteAlfanumerica(s);
        System.out.println("Inserisci il numero di cifre che vuoi");
        int n = in.nextInt();
        g.setnCifre(n);
        System.out.println(g.genera());
        System.out.println("Ciclo per più passi");
        for (int i = 0; i < 10; i++) {
            System.out.println(g.genera());
        }
        System.out.println(g);
    }
}