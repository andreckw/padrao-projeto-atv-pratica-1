import java.util.ArrayList;
import java.util.List;

import classes.Estatisticas;
import classes.ExportarPdf;
import classes.Grafico;
import classes.Relatorio;
import interfaces.IPedido;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> pedidos = new ArrayList<>();
        pedidos.add("pedido 1");
        pedidos.add("pedido 2");
        pedidos.add("pedido 3");
        IPedido relatorio = new Relatorio(pedidos);

        System.out.println(relatorio.descricao());

        IPedido estatistica = new Estatisticas(relatorio);
        IPedido grafico = new Grafico(relatorio);
        IPedido exportarPdf = new ExportarPdf(relatorio);

        System.out.println(estatistica.descricao());
        System.out.println(grafico.descricao());
        System.out.println(exportarPdf.descricao());
        
    }
}
