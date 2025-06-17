package exercicioslogica.iniciante;

import java.util.Scanner;

public class SequenciaDNumerosSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int soma = 0;

        while (m > 0 && n > 0 ){
            int men = Math.min(m,n);
            int mai = Math.max(m,n);

            for (int i = men; i <= mai; i++){
                soma += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum = "+soma);

            m = sc.nextInt();
            n = sc.nextInt();
            soma = 0;
        }
        sc.close();
    }
}
