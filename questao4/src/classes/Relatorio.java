package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.IPedido;

public class Relatorio implements IPedido {

    protected List<String> pedidos = new ArrayList<>();

    public Relatorio(List<String> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String descricao() {
        String desc = "";
        for (String string : pedidos) {
            desc += string + " - ";
        }
        return desc;
    }

    @Override
    public int quantidadePedidos() {
        return pedidos.size();
    }
    
}
