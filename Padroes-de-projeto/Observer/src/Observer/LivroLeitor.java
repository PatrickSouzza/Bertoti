package Observer;

public class LivroLeitor {
    public static void main(String[] args) {
        // Criando os objetos
        Leitor leitor1 = new Leitor("Patrick");
        Leitor leitor2 = new Leitor("Julie");

        Biblioteca biblioteca = new Biblioteca();
        
        // Registrando os observadores
	    biblioteca.addObserver(leitor1);
	    biblioteca.addObserver(leitor2);
	
	    // Adicionando um novo livro
	    biblioteca.adicionarLivro("Entendendo Algoritimos");
	
	    // Removendo um observador
	    biblioteca.removeObserver(leitor2);
	
	    // Adicionando outro livro
	    biblioteca.adicionarLivro("Senhor dos Anéis - As duas torres");
}
}