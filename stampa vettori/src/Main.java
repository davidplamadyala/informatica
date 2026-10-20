import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a;
        a = new int[10];
        int scelta;
        int pari = 0, dispari = 0;
        do{
            System.out.println("quanti numeri vuoi inserire");
            scelta = in.nextInt();
        }while(scelta >= 10);

        for (int i = 0; i < scelta; i++) {
            System.out.println("Inserisci un numero");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < scelta; i++) {
            if(a[i] % 2 == 0){
                pari ++;
            }
        }
        System.out.println("Ci sono " + pari + " numeri pari");
        for (int i = 0; i < scelta; i++) {
            if(a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
        for (int i = 0; i < scelta; i++) {
            if(a[i] % 2 != 0){
                dispari ++;
            }
        }
        System.out.println("Ci sono " + dispari + " numeri dispari");
        for (int i = 0; i < scelta; i++) {
            if(a[i] % 2 != 0){
                System.out.println(a[i]);
            }
        }
    }
}