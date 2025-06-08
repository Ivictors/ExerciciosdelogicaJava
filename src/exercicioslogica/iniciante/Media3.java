package exercicioslogica.iniciante;

import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0){
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5.0) {
            System.out.printf("Aluno reprovado.\n");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("Aluno em exame.\n");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            media = ( media + notaExame) / 2;

            if ( media >= 5.0){
                System.out.printf("Aluno aprovado.\n");
            } else if (media <= 4.9) {
                System.out.printf("Aluno reprovado.\n");
            }

            System.out.printf("Media final: %.1f\n", media);
        }


        sc.close();
    }
}
