package exercicioslogica.iniciante;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;
        int i;

        for (i = 1; i <=100; i++){
            int numero = sc.nextInt();
            if (numero >= maior){
                maior = numero;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
