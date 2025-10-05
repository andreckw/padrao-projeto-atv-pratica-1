package classes;

import interfaces.IFormaPagemento;

public class CartaoDebito implements IFormaPagemento {
    @Override
    public void pagar() {
        System.out.println("Pagou com Cartao de Debito");
    }
}
