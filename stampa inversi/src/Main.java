import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int N = 10;
        int[] v = new int[N];
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (n < N) {
            System.out.print("Inserisci un intero (negativo per terminare): ");
            int x = in.nextInt();
            if (x < 0) {
                break;
            }
            v[n] = x;
            n++;
        }
        System.out.println("Numeri inseriti in ordine inverso:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        in.close();
    }
}