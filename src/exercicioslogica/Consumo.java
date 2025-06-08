package exercicioslogica;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int x = teclado.nextInt();
        double y = teclado.nextDouble();

        double combustivelG =  x / y;

        System.out.printf("%.3f km/l\n",combustivelG);
        teclado.close();
    }
}
