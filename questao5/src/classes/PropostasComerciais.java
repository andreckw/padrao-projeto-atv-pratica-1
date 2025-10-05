package classes;

public class PropostasComerciais extends Documento {

    public PropostasComerciais(String cor, String fonte, String logotipo) {
        super(cor, fonte, logotipo);
    }

    protected PropostasComerciais(Documento documento) {
        super(documento);
    }

    @Override
    public Documento copy() {
        return new PropostasComerciais(this);
    }

}
