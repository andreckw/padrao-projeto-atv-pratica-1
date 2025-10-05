package classes;

import interfaces.IPedido;

public abstract class AdicionalRelatorio implements IPedido {
    protected IPedido pedido;

    public AdicionalRelatorio(IPedido pedido) {
        this.pedido = pedido;
    }    
}
