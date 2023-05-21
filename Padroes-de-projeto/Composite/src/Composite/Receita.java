package Composite;

import java.util.ArrayList;
import java.util.List;

class Receita implements ItemReceita {
    private String nome;
    private List<ItemReceita> itens = new ArrayList<>();

    public Receita(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItemReceita item) {
        itens.add(item);
    }

    public void removerItem(ItemReceita item) {
        itens.remove(item);
    }

    public void exibirInformacoes() {
        System.out.println("Receita: " + nome);
        for (ItemReceita item : itens) {
            item.exibirInformacoes();
        }
    }
}