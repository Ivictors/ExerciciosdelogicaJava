package exercicioslogica.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) throws IOException {

        System.out.println("1 - Cachorro quente, R$4,00");
        System.out.println("2 - X-Salada, R$4,50");
        System.out.println("3 - X-Bacon, R$5,00");
        System.out.println("4 - Torrada simples, R$2,00");
        System.out.println("5 - Refrigerante, R$1,50");

        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double resultado = 0;

        if (codigo == 1) {
            resultado = (double) quantidade * 4.00;
            System.out.printf("Total: R$ %.2f\n", resultado);
        } else if (codigo == 2) {
            resultado = (double) quantidade * 4.50;
            System.out.printf("Total: R$ %.2f\n", resultado);
        } else if (codigo == 3) {
            resultado = (double) quantidade * 5.00;
            System.out.printf("Total: R$ %.2f\n", resultado);
        } else if (codigo == 4) {
            resultado = (double) quantidade * 2.00;
            System.out.printf("Total: R$ %.2f\n", resultado);
        } else if (codigo == 5) {
            resultado = (double) quantidade * 1.50;
            System.out.printf("Total: R$ %.2f\n", resultado);
        }

        sc.close();
    }
}

