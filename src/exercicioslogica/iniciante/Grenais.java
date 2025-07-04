package exercicioslogica.iniciante;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grenais = 0;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empate = 0;

        int opcao;

        do {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            grenais++;

            if (golsInter > golsGremio) {
                vitoriaInter++;
            } else if (golsGremio > golsInter) {
                vitoriaGremio++;
            } else empate++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();

        }  while (opcao == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);

        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}
