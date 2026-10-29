import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci una data (aaaa-mm-gg): ");
        String testo = in.nextLine();
        LocalDate data = LocalDate.parse(testo);
        System.out.println("Data inserita: " + data);
        System.out.println("Tra un giorno: " + data.plusDays(1));
        System.out.println("Tra un mese: " + data.plusMonths(1));
        System.out.println("Tra un anno: " + data.plusYears(1));
    }
}