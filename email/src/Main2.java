import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un indirizzo email: ");
        String indirizzo = in.nextLine();
        Email email = new Email(indirizzo);
        String dominioPrimoLivello = email.getDominioPrimoLivello();
        System.out.println("Dominio di primo livello: " + dominioPrimoLivello);
    }
}