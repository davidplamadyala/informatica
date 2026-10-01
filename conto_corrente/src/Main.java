import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ContoCorrente c1 = new ContoCorrente("mario","rossi","trueg48hy");
        System.out.println(c1);

        System.out.println("Inserisci il nome:");
        String nome=in.next();
        System.out.println("Inserisci il cognome:");
        String cognome=in.next();
        System.out.println("Inserisci codice univoco del conto");
        String codiceConto= in.next();
        ContoCorrente c = new ContoCorrente(nome,cognome,codiceConto);
        System.out.println("0-esci");
        System.out.println("1-preleva");
        System.out.println("2-deposita");
        System.out.println("3-visualizza saldo");
        System.out.println("4-visualizza codice univoco del conto");
        System.out.println("5-visualizza correntista");
        System.out.println("6-visualizza tutte le informazioni");
        int scelta=in.nextInt();
        while(scelta!=0){
            if(scelta==1){
                System.out.println("Quanto vuoi prelevare");
                double soldi=in.nextDouble();
                System.out.println(c.preleva(soldi));
            }else if(scelta==2){
                System.out.println("Quanti soldi vuoi depositare");
                double soldi1=in.nextDouble();
                System.out.println(c.deposita(soldi1));
            }else if(scelta==3){
                System.out.println(c.getSaldo());
            }else if(scelta==4){
                System.out.println(c.getCodice());
            }else if(scelta==5){
                System.out.println(c.getNominativo());
            }else if(scelta==6){
                System.out.println(c);
            }
            System.out.println("0-esci");
            System.out.println("1-preleva");
            System.out.println("2-deposita");
            System.out.println("3-visualizza saldo");
            System.out.println("4-visualizza codice univoco del conto");
            System.out.println("5-visualizza correntista");
            System.out.println("6-visualizza tutte le informazioni");
            scelta=in.nextInt();
        }
        System.out.println("Fine programma");
    }
}
