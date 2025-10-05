package classes.factory;

import classes.CartaoDebito;
import interfaces.IFabricaFormaPagamento;
import interfaces.IFormaPagemento;

public class FabricaCartoDebito implements IFabricaFormaPagamento {

    @Override
    public IFormaPagemento criarFormaPagemento() {
        return new CartaoDebito();
    }
    
    
}
