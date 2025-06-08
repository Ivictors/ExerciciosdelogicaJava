package exercicioslogica.iniciante;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int codigoPeca1 = teclado.nextInt();
        int numeroPeca1 = teclado.nextInt();
        double valorUnitario1 = teclado.nextDouble();

        int codigoPeca2 = teclado.nextInt();
        int numeroPeca2 = teclado.nextInt();
        double valorUnitario2 = teclado.nextDouble();

        double valorP1 = numeroPeca1 * valorUnitario1;
        double valorP2 = numeroPeca2 * valorUnitario2;
        double total = valorP1+valorP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}
