package classes.observer;

import classes.Topico;

/**
 * Pattern usado foi o Observer, por ser o mais eficiente em 
 * envio de informacao quando tem alguma atualizacao
 */
public abstract class Observer {
    protected Topico topico;

    public abstract void update();
}
