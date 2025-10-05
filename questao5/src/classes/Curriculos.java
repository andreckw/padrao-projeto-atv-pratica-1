package classes;

public class Curriculos extends Documento {

    public Curriculos(String cor, String fonte, String logotipo) {
        super(cor, fonte, logotipo);
    }

    protected Curriculos(Documento documento) {
        super(documento);
    }

    @Override
    public Documento copy() {
        return new Curriculos(this);
    }

}
