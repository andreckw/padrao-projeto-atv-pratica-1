package classes;

import interfaces.IFormaPagemento;

public class CartaoCredito implements IFormaPagemento {
    
    @Override
    public void pagar() {
        System.out.println("Pagou com Cartao de Credito");
    }
}
