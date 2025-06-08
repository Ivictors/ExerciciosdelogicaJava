package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class TesteSelecao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (b > c && d > a) {
            if (c + d > a + b && c > 0 && d > 0) {
                if (a % 2 == 0) {
                    System.out.println("Valores aceitos");
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }


        sc.close();
    }
}
