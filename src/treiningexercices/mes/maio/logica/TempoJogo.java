package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hInicioJogo = input.nextInt();
        int hFinalJogo = input.nextInt();
        int duracao = 0;

        if (hInicioJogo == hFinalJogo) {
            duracao = 24;
        } else if (hFinalJogo > hInicioJogo) {
            duracao = hFinalJogo - hInicioJogo;
        } else if (hFinalJogo < hInicioJogo) {
            duracao = (hFinalJogo - hInicioJogo) + 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();
    }
}
