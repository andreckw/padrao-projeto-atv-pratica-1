package interfaces;

import classes.Documento;

/**
 * Foi escolhido o Prototipe Pattern por ele ser o mais 
 * eficiente em fazer uma copia editavel do original
 */
public interface Prototype {
    public Documento copy();
}
