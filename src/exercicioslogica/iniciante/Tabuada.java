package exercicioslogica.iniciante;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int multiplicacao;

        int i = 1;
        while (i < n) {
          multiplicacao =  i * n;
            System.out.println(i + " x " + n + " = " + multiplicacao);
            if (i >= 10) break;
            i++;
        }
        sc.close();
    }
}