package treiningexercices.mes.maio.logica;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracteristica1 = sc.nextLine();
        String caracteristica2 = sc.nextLine();
        String caracteristica3 = sc.nextLine();

        if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave") && caracteristica3.equalsIgnoreCase("carnivoro")) {
            System.out.println("aguia");
        } else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave") && caracteristica3.equalsIgnoreCase("onivoro")) {
            System.out.println("pomba");
        } else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("mamifero") && caracteristica3.equalsIgnoreCase("onivoro")) {
            System.out.println("homem");
        } else if (caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("mamifero") && caracteristica3.equalsIgnoreCase("herbivoro")) {
            System.out.println("vaca");
        } else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("inseto") && caracteristica3.equalsIgnoreCase("hematofago")) {
            System.out.println("pulga");
        } else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("inseto") && caracteristica3.equalsIgnoreCase("herbivoro")) {
            System.out.println("lagarta");
        } else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("anelideo") && caracteristica3.equalsIgnoreCase("hematofago")) {
            System.out.println("sanguessuga");
        } else if (caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("anelideo") && caracteristica3.equalsIgnoreCase("onivoro")) {
            System.out.println("minhoca");
        }else System.out.println("Dados de entrada invalidos.");

        sc.close();
    }
}
