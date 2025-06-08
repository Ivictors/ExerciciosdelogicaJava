package treiningexercices.mes.maio.test;

import treiningexercices.mes.maio.domain.SistemaCadastroProdutos;

public class SistemaCadastroTeste {
    public static void main(String[] args) {
        SistemaCadastroProdutos produto1 = new SistemaCadastroProdutos("Tenis",1_200.00,30);
        SistemaCadastroProdutos produto2 = new SistemaCadastroProdutos("Camiseta",200.00,100);
        SistemaCadastroProdutos produto3 = new SistemaCadastroProdutos("Calca",100.00,100);

        produto1.exibir();
        System.out.println("--------------------");
        produto2.exibir();
        System.out.println("---------------------");
        produto3.exibir();
    }
}
