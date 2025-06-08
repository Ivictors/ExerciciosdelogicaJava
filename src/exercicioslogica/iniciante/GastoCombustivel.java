package exercicioslogica.iniciante;
import java.util.Scanner;
public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();

        double litros = (double)(tempoGasto * velocidadeMedia) / 12;

        System.out.printf("%.3f" , litros);

        input.close();
    }
}
