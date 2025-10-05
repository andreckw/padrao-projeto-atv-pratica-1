package classes.observer;

import classes.Topico;

/**
 * Extende o Observer para enviar a ultima noticia do topico
 */
public class EnviarNoticiasObserver extends Observer {

    public EnviarNoticiasObserver(Topico topico) {
        this.topico = topico;
        this.topico.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Ultima noticia de " + this.topico.getClass().getSimpleName() + ": " + this.topico.ultimaNoticia());
    }

    
}