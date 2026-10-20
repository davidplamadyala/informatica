import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Random random = new Random();
        int [] v;
        v = new int[10];
        int a, b;
        System.out.println("inserisci il primo numero");
        a = in.nextInt();
        System.out.println("Inserisci il secondo numero");
        b = in.nextInt();
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt((b - a) + 1) + a;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.println();
        int m = (a + b) / 2;
        for (int i = a; i < m; i++) {
            System.out.println(v[i]);
        }
        System.out.println();
        for (int i = m + 1; i < b; i++) {
            System.out.println(v[i]);
        }
    }
}