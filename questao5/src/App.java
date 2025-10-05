import classes.Curriculos;
import classes.Documento;
import classes.PropostasComerciais;
import classes.Relatorio;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia os 3 documentos originais e mostra o endereco da memoria deles
        Documento curriculo = new Curriculos("azul", "Arial", "Aquele");
        Documento proposta = new PropostasComerciais("verde", "Arial", "Aquele 2");
        Documento relatorio = new Relatorio("vermelho", "Arial", "Aquele 3");

        System.out.println("Documentos originais");
        System.out.println("Curriculo: #" + curriculo.hashCode());
        System.out.println("Proposta: #" + proposta.hashCode());
        System.out.println("Relatorio: #" + relatorio.hashCode());

        // Faz a copia dos documentos originais e mostra o novo endereco de memoria deles
        Documento curriculo2 = curriculo.copy();
        Documento proposta2 = proposta.copy();
        Documento relatorio2 = relatorio.copy();


        System.out.println("------------------------------------------]");
        System.out.println("Documentos copiados");
        System.out.println("Curriculo: #" + curriculo2.hashCode());
        System.out.println("Proposta: #" + proposta2.hashCode());
        System.out.println("Relatorio: #" + relatorio2.hashCode());
    }
}
