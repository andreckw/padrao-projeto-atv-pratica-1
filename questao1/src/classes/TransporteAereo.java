package classes;

public class TransporteAereo extends Transporte {
    protected Float peso;
    
    public TransporteAereo(Float peso) {
        this.peso = peso;
    }

    @Override
    public Float calcular() {
        return 10 * peso;
    }
}
