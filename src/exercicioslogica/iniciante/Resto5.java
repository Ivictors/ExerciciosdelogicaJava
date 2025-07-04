package exercicioslogica.iniciante;

import java.util.Scanner;

public class Resto5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int menor = Math.min(x,y);
        int maior = Math.max(x,y);

        for (int i = menor + 1; i < maior ; i++) {
            int resto = i % 5;
            if (resto == 2 || resto == 3) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
