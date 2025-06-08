package treiningexercices.mes.maio.logica;
import java.util.Scanner;
public class Cedulas {
    public static void main(String[] args) {

        int n100,n50, n20,n10,n5,n2, n1;
        double resto = 0;

        Scanner input = new Scanner (System.in);
        int valor = input.nextInt();

        n100 = valor / 100;
        resto = valor % 100.0;

        n50 = (int) resto / 50;
        resto = resto % 50.0;

        n20 = (int) resto / 20;
        resto = resto % 20.0;

        n10 = (int) resto / 10;
        resto = resto % 10.0;

        n5 = (int) resto / 5;
        resto = resto % 5.0;

        n2 = (int) resto / 2;
        resto = resto % 2.0;

        n1 = (int) resto / 1;
        resto = resto % 1.0;

        System.out.printf("%d \n", valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);

        input.close();
    }
}
