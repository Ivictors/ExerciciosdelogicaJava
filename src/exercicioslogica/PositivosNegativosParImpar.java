package exercicioslogica;

import java.util.Scanner;

public class PositivosNegativosParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;
        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int i = 0; i <= 4; i++){
            int valores = sc.nextInt();
            if (valores % 2 == 0){
                somaPar += 1;
            }else somaImpar += 1;
            if (valores >= 1){
                somaPositivos += 1;
            }else if (valores < 0) {
                somaNegativos += 1;
            }
        }

        System.out.println(somaPar + " valor(es) par(es)");
        System.out.println(somaImpar + " valor(es) impar(es)");
        System.out.println(somaPositivos + " valor(es) positivo(s)");
        System.out.println(somaNegativos + " valor(es) negativo(s)");

        sc.close();
    }
}
