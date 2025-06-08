package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        String nome = teclado.nextLine();
        double salarioFixo = teclado.nextDouble();
        double vendas = teclado.nextDouble();

        double total = salarioFixo + (vendas * 0.15);


        System.out.printf("TOTAL = R$ %.2f\n ", total);


        teclado.close();
    }
}
