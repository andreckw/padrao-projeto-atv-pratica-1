import classes.factory.FabricaCartoCredito;
import classes.factory.FabricaCartoDebito;
import classes.factory.FabricaPix;
import interfaces.IFabricaFormaPagamento;
import interfaces.IFormaPagemento;

public class App {
    public static void main(String[] args) throws Exception {
        IFabricaFormaPagamento criarFormaPagamento;
        IFormaPagemento formaPagemento;

        criarFormaPagamento = new FabricaPix();
        formaPagemento = criarFormaPagamento.criarFormaPagemento();

        formaPagemento.pagar();

        criarFormaPagamento = new FabricaCartoCredito();
        formaPagemento = criarFormaPagamento.criarFormaPagemento();

        formaPagemento.pagar();

        criarFormaPagamento = new FabricaCartoDebito();
        formaPagemento = criarFormaPagamento.criarFormaPagemento();

        formaPagemento.pagar();
    }
}
