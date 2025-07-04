package exercicioslogica.iniciante;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int tentativa;

        do {
            tentativa = sc.nextInt();
            if (senha == tentativa){
                System.out.println("Acesso Permitido");
            } else System.out.println("Senha Invalida");
        } while (tentativa != senha);

        sc.close();
    }
}
