package classes;

import java.util.ArrayList;
import java.util.List;

import classes.observer.EnviarNoticiasObserver;
import classes.observer.Observer;

/**
 * Classe que contem a base para envio da ultima 
 * noticia sempre que for adicionada, assim sua heranca nao precisara adicionar 
 * algo a mais a menos que seja necessario uma sobreescrita
 */
public abstract class Topico {
    protected List<String> noticias = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public Topico() {
        new EnviarNoticiasObserver(this);
    }

    public String ultimaNoticia() {
        return noticias.get(noticias.size() - 1);
    }

    public void addNoticia(String novoNoticia) {
        noticias.add(novoNoticia);
        this.notifyAllObserver();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
