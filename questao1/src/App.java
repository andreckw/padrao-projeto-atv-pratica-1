import classes.TransporteAereo;
import classes.TransporteTerrestre;

public class App {
    public static void main(String[] args) throws Exception {
        TransporteAereo transporteAereo = new TransporteAereo(0.20f);
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(5f);

        System.out.println("Transporte Aereo: " + transporteAereo.calcular());
        System.out.println("Transporte terrestre: " + transporteTerrestre.calcular());
    }
}
