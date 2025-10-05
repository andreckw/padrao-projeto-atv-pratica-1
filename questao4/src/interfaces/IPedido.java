package interfaces;

/**
 * Foi usado o Decorator Pattern por ser o mais eficiente 
 * em adicao de funcionalidade sem modificar o padrao
 */
public interface IPedido {
    public String descricao();
    public int quantidadePedidos();
}
