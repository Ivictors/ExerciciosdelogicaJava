package exercicioslogica.iniciante;

import java.util.Scanner;

public class Multiplos13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

        int menor = Math.min(x,y);
        int maior = Math.max(x,y);

        while (menor <= maior){
            if (menor %13 != 0){
                soma += menor;
            }
            menor++;
        }
        System.out.println(soma);


        sc.close();
    }
}
