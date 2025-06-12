package exercicioslogica.iniciante;

import java.util.Scanner;

public class ExperienciasLaboratoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdTestes = sc.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < qtdTestes; i++) {
            int quantidade = sc.nextInt();
            String tipo = sc.next().toUpperCase();

            switch (tipo) {
                case "C":
                    coelhos += quantidade;
                    break;
                case "R":
                    ratos += quantidade;
                    break;
                case "S":
                    sapos += quantidade;
                    break;
                default:
                    System.out.println("Tipo inválido de cobaia");
            }
        }

        int total = coelhos + ratos + sapos;

        double percCoelhos = ((double) coelhos / total) * 100;
        double percRatos = ((double) ratos / total) * 100;
        double percSapos = ((double) sapos / total) * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", percCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percSapos);

        sc.close();
    }
}
