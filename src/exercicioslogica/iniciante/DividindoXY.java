package exercicioslogica.iniciante;

import java.util.Scanner;

public class DividindoXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado;
        int x;
        int y;
        int z = sc.nextInt();

        for (int i = 0; i < z; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (y != 0) {
                resultado = (double) x / y;
                System.out.printf("%.1f\n", resultado);
            } else System.out.println("divisao impossivel");
        }

        sc.close();
    }
}
