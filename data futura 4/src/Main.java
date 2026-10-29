import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una data NON valida (aaaa-mm-gg): ");
        String testo = in.nextLine();

        LocalDate data = LocalDate.parse(testo);

        System.out.println("Data: " + data);
    }
}