package exercicioslogica.iniciante;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] valores = new int[10];
        valores[0] = n;

        for (int i = 1; i < valores.length; i++) {
            valores[i] = valores[i - 1] * 2;
        }

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("N[%d] = %d%n", i, valores[i]);
        }

        sc.close();
    }
}
