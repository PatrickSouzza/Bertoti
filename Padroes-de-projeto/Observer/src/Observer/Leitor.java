package Observer;

class Leitor implements Observer {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String livro) {
        System.out.println(nome + " recebeu a notificação: Novo livro disponível - " + livro);
    }
}