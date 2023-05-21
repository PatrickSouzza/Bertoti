package CombiningPatterns;

public class Main {
    public static void main(String[] args) {
        // Criando os Pokémon
        Pokemon pikachu = new Pikachu();
        Pokemon charizard = new Charizard();

        // Criando a Pokedex
        PokedexController pokedexController = PokedexController.getInstance();

        // Criando os Treinadores
        Trainer ash = new PokemonTrainer("Ash");
        Trainer misty = new PokemonTrainer("Misty");

        // Registrando os Treinadores na Pokedex
        pokedexController.addTrainer(ash);
        pokedexController.addTrainer(misty);

        // Capturando Pokémon
        pokedexController.catchPokemon(pikachu);
        pokedexController.catchPokemon(charizard);

        // Exibindo todos os Pokémon na Pokedex
        pokedexController.displayAllPokemon();
    }
}
