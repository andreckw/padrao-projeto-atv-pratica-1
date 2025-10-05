package classes;

import interfaces.Prototype;

/**
 * Classe abstrata dos Documentos utilizados pela empresa, implementa
 * a interface Prototype para a heranca ser obrigada a colocar o copy
 */
public abstract class Documento implements Prototype {
    protected String cor;
    protected String fonte;
    protected String logotipo;


    public Documento(String cor, String fonte, String logotipo) {
        this.cor = cor;
        this.fonte = fonte;
        this.logotipo = logotipo;
    }

    /**
     * Esse construtor e utilizado para fazer a copia, apenas 
     * ele e herancas podem utilizar esse contrutor
     * @param documento o documento que sera copiado
     */
    protected Documento(Documento documento) {
        this.cor = documento.cor;
        this.fonte = documento.fonte;
        this.logotipo = documento.logotipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getLogotipo() {
        return logotipo;
    }
    
    public void setLogotipo(String logotipo) {
        this.logotipo = logotipo;
    }
}
