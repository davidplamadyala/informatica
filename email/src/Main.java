import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un indirizzo email: ");
        String indirizzo = in.nextLine();
        Email email = new Email(indirizzo);
        String dominio = email.getDominio();
        System.out.println("Dominio: " + dominio);
    }
}