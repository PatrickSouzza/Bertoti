package Composite;

public class LivroDeReceitas {
    public static void main(String[] args) {
        Receita boloDeChocolate = new Receita("Bolo de Chocolate");
        boloDeChocolate.adicionarItem(new Ingrediente("Farinha de Trigo", 2.0));
        boloDeChocolate.adicionarItem(new Ingrediente("Açúcar", 2.0));
        boloDeChocolate.adicionarItem(new Ingrediente("Ovo", 3.0));
        boloDeChocolate.adicionarItem(new Ingrediente("Leite", 1.0));
        boloDeChocolate.adicionarItem(new Receita("Cobertura de Chocolate"));
        boloDeChocolate.exibirInformacoes();

        System.out.println();

        Receita coberturaDeChocolate = new Receita("Cobertura de Chocolate");
        coberturaDeChocolate.adicionarItem(new Ingrediente("Chocolate em Pó", 1.0));
        coberturaDeChocolate.adicionarItem(new Ingrediente("Açúcar", 1.0));
        coberturaDeChocolate.adicionarItem(new Ingrediente("Leite", 0.5));
        coberturaDeChocolate.exibirInformacoes();
    }
}