import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        System.out.println("Oggi: " + oggi);
        System.out.println("Tra un giorno: " + oggi.plusDays(1));
        System.out.println("Tra un mese: " + oggi.plusMonths(1));
        System.out.println("Tra un anno: " + oggi.plusYears(1));
    }
}