package exercicioslogica.iniciante;

import java.util.Scanner;

public class QuantidadePares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i <= 4; i++){
            int valores = sc.nextInt();
            if (valores % 2 == 0){
                soma += 1;
            }
        }
        System.out.println(soma + " valores pares");

        sc.close();
    }
}
