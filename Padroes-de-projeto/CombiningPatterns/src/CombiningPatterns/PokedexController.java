package CombiningPatterns;

import java.util.List;
import java.util.ArrayList;

//(Singleton)
public class PokedexController {
 private static PokedexController instance;
 private Pokedex pokedex;
 private List<Trainer> trainers;

 private PokedexController() {
     pokedex = new Pokedex();
     trainers = new ArrayList<>();
 }

 public static PokedexController getInstance() {
     if (instance == null) {
         instance = new PokedexController();
     }
     return instance;
 }

 public void addTrainer(Trainer trainer) {
     trainers.add(trainer);
 }

 public void catchPokemon(Pokemon pokemon) {
     pokedex.addPokemon(pokemon);
     notifyTrainers(pokemon);
 }

 private void notifyTrainers(Pokemon pokemon) {
     for (Trainer trainer : trainers) {
         trainer.update(pokemon);
     }
 }

 public void displayAllPokemon() {
     pokedex.displayAllPokemon();
 }
}