package exercicioslogica.iniciante;

import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        int ano, mes, dia;

        Scanner input = new Scanner(System.in);
        int dias = input.nextInt();

        ano = dias / 365;
        mes = (dias % 365) / 30;
        dia = (dias % 365) % 30;

        System.out.printf("%d ano(s)\n%d mes(s)\n%d dia(s)\n",ano,mes,dia);


        input.close();
    }
}