package classes;

import interfaces.IPedido;

public class Estatisticas extends AdicionalRelatorio {

    public Estatisticas(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String descricao() {
        return "Foi pedido: " + this.quantidadePedidos();
    }

    @Override
    public int quantidadePedidos() {
        return pedido.quantidadePedidos();
    }
    
}
