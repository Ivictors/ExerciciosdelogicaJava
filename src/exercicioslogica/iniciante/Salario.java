package exercicioslogica.iniciante;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, hTrabalhadas;
        double vHoraTrabalhada, salario;

        numero = sc.nextInt();
        hTrabalhadas = sc.nextInt();
        vHoraTrabalhada = sc.nextDouble();

        salario = hTrabalhadas*vHoraTrabalhada;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = %.2f\n", salario);

        sc.close();
    }
}
