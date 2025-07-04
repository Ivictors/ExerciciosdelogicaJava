package exercicioslogica.iniciante;

import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            int n = sc.nextInt();
            if (n <= 0) {
                n = 1;
            }
            vect [i] = n;
            System.out.printf("X[%d] = %d%n", i, vect[i]);
        }

        sc.close();
    }
}
