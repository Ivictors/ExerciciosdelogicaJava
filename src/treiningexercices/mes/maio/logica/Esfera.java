package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159;
        double raio = teclado.nextDouble();

        double volume = (4.0/3) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();}
}
