package Singleton;

public class Pokedex {
    private static Pokedex instance;

    private Pokedex() {
      
    }

    public static Pokedex getInstance() {
        if (instance == null) {
            instance = new Pokedex();
        }
        return instance;
    }

    public String getPokemonInfo(String pokemonName) {
        String info = "";

        if (pokemonName.equals("Pikachu")) {
            info = "Pikachu é um Pokémon elétrico conhecido por sua cauda com formato de raio.";
        } else if (pokemonName.equals("Charizard")) {
            info = "Charizard é um Pokémon do tipo Fogo/Voador com asas que podem lançar chamas.";
        } else if (pokemonName.equals("Bulbasaur")) {
            info = "Bulbasaur é um Pokémon do tipo Planta/Veneno com uma semente nas costas.";
        } else {
            info = "Pokémon não encontrado na Pokedex.";
        }

        return info;
    }
}