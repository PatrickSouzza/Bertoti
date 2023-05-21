package Observer;

import java.util.List;
import java.util.ArrayList;

class Biblioteca {
    private List<Observer> observers;
    private String livro;

    public Biblioteca() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarLeitores() {
        for (Observer observer : observers) {
            observer.update(livro);
        }
    }

    public void adicionarLivro(String livro) {
        this.livro = livro;
        notificarLeitores();
    }
}