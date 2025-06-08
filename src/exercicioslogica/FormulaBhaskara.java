package exercicioslogica;

import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double c = sc.nextDouble();

         double x1;
         double x2;
         double delta = (Math.pow(b,2)) - 4 * a * c;

         if (a <= 0.0 || b <= 0.0 || c <= 0.0 || delta < 0.0){
             System.out.println("impossivel calcular");
         }else {
             x1 = (-b + Math. sqrt(delta)) / (2 * a);
             x2 = (-b - Math. sqrt(delta)) / (2 * a);

             System.out.printf("R1 = %.5f\n" , x1);
             System.out.printf("R2 = %.5f\n" , x2);
         }

        sc.close();
    }
}
