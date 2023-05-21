package Composite;

class Ingrediente implements ItemReceita {
    private String nome;
    private double quantidade;

    public Ingrediente(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("- " + quantidade + " " + nome);
    }
}
