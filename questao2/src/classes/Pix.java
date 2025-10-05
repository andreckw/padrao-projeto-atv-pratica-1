package classes;

import interfaces.IFormaPagemento;

public class Pix implements IFormaPagemento {

    @Override
    public void pagar() {
        System.out.println("Pagou com o Pix");
    }
    
    

}
