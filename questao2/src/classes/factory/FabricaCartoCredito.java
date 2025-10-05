package classes.factory;

import classes.CartaoCredito;
import interfaces.IFabricaFormaPagamento;
import interfaces.IFormaPagemento;

public class FabricaCartoCredito implements IFabricaFormaPagamento {

    @Override
    public IFormaPagemento criarFormaPagemento() {
        return new CartaoCredito();
    }
    
}
