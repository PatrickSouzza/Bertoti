package Singleton;

public class Main {
    public static void main(String[] args) {

        Pokedex pokedex = Pokedex.getInstance();


        String info = pokedex.getPokemonInfo("Pikachu");
        System.out.println(info);


        info = pokedex.getPokemonInfo("Charizard");
        System.out.println(info);
        
        info = pokedex.getPokemonInfo("");
        System.out.println(info);
    }
}