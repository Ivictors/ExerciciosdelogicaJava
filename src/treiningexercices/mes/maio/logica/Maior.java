package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        int maiorAB = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        int maiorABC = (maiorAB + num3 + Math.abs(maiorAB -  num3)) / 2;

        System.out.println(maiorABC + " eh o maior");

        teclado.close();
    }
}
