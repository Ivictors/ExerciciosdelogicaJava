package exercicioslogica.iniciante;

import java.util.Scanner;

public class ExibirImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorImpar = sc.nextInt();

        int i = 1;

        while (i <= valorImpar) {
            System.out.println(i);
            i += 2;
        }

        sc.close();
    }
}
