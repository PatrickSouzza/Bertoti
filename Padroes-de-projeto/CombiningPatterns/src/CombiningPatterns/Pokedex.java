package CombiningPatterns;

import java.util.List;
import java.util.ArrayList;

//Facade
public class Pokedex {
 private List<Pokemon> pokemonList;

 public Pokedex() {
     pokemonList = new ArrayList<>();
 }

 public void addPokemon(Pokemon pokemon) {
     pokemonList.add(pokemon);
 }

 public void displayAllPokemon() {
     for (Pokemon pokemon : pokemonList) {
         pokemon.display();
     }
 }
}