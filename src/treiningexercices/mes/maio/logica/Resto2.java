package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int resto = 0;

        for (int i = 1; i < 10000; i++) {
            if (i % n == 2) {
                resto = i;
                System.out.println(resto);
            }
        }

    }
}
