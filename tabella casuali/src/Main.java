import java.util.Random;
public class Main {
    public static void main(String[] args) {
        final int N = 10;
        int[] v = new int[N];
        Random rnd = new Random();

        for (int i = 0; i < N; i++) {
            v[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf("%4d", v[i]);
        }
        System.out.println();
    }
}