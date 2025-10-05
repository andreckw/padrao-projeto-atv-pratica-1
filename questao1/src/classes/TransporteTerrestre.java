package classes;

public class TransporteTerrestre extends Transporte {
    
    protected Float km;

    public TransporteTerrestre(Float km) {
        this.km = km;
    }

    @Override
    public Float calcular() {
        return 10 * km;
    }
}