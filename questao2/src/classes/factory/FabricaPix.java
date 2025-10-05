package classes.factory;

import classes.Pix;
import interfaces.IFabricaFormaPagamento;
import interfaces.IFormaPagemento;

public class FabricaPix implements IFabricaFormaPagamento {

    @Override
    public IFormaPagemento criarFormaPagemento() {
        return new Pix();
    }
    
}
