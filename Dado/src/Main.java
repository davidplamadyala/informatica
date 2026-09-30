import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            Dado d1 = new Dado();
            System.out.println(d1);
            Dado d2 = new Dado(20);
            System.out.println(d2);
            System.out.println("Dopo del lancio: " + d2.lancia());
    }
  }

