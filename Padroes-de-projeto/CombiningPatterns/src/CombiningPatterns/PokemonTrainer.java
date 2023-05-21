package CombiningPatterns;

public class PokemonTrainer implements Trainer {
	 private String name;

	 public PokemonTrainer(String name) {
	     this.name = name;
	 }

	 @Override
	 public void update(Pokemon pokemon) {
	     System.out.println(name + " recebeu um novo Pokémon: ");
	     pokemon.display();
	 }
	}