import classes.Esportes;
import classes.Politica;
import classes.Tecnologia;
import classes.Topico;

public class App {
    public static void main(String[] args) throws Exception {
        // Instacia os topicos de Tecnologia, Esportes e Politica e adiciona uma noticia para seus respectivos topicos
        Topico tecnologia = new Tecnologia();
        Topico esportes = new Esportes();
        Topico politica = new Politica();


        tecnologia.addNoticia("Bomba, a intel lancou a CPU i12 40k");
        esportes.addNoticia("Bomba, o novo BOMBA PACTH lancou");
        politica.addNoticia("Finalmente descobriram se Mark Zukenberg realmente e um ET");
    }
}
