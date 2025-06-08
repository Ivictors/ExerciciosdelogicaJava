package exercicioslogica.iniciante;

import java.util.Scanner;

public class SomaImparesConsecutivosUM {

    public static int verificaImpares(int x, int y) {
        if (x == y) return 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return  soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int imparesEntreXY = 0;

        System.out.println(imparesEntreXY = verificaImpares(x,y));
        sc.close();
    }
}