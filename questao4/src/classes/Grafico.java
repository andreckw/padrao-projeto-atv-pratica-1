package classes;

import interfaces.IPedido;

public class Grafico extends AdicionalRelatorio {

    public Grafico(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String descricao() {
        String desc = pedido.descricao().replaceAll(" - ", "\n");
        return desc;
    }

    @Override
    public int quantidadePedidos() {
        return 0;
    }
    
}
