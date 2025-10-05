package classes;

public class Relatorio extends Documento {

    public Relatorio(String cor, String fonte, String logotipo) {
        super(cor, fonte, logotipo);
    }

    protected Relatorio(Documento documento) {
        super(documento);
    }

    @Override
    public Documento copy() {
        return new Relatorio(this);
    }

}
