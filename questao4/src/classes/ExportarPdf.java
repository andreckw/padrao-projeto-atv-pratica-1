package classes;

import interfaces.IPedido;

public class ExportarPdf extends AdicionalRelatorio {

    public ExportarPdf(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String descricao() {
        return "Exportou em pdf: " + pedido.descricao();
    }

    @Override
    public int quantidadePedidos() {
        return 0;
    }
    
}
