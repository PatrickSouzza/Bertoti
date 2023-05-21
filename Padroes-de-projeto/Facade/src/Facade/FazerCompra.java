package Facade;

public class FazerCompra {
    public static void main(String[] args) {
        CarteiraFacade carteira = new CarteiraFacade();
        carteira.realizarCompra("Patrick", 1000.0);
    }

}
