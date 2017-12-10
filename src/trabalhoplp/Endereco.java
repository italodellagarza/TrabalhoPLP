/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe Ramos Palmuti
 * Classe Endereco (Endereco.java)
 */
package trabalhoplp;

/**
 * Classe para o endereço, contendo cidade e país como atributos.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe Ramos Palmuti
 */
public class Endereco {
    public String cidade;
    public String pais;
    
    /**
     * Construtor de classe.
     * @param cidade
     * @param pais 
     */
    public Endereco(String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
    }
    
    /**
     * Para impressão de endereço.
     * @return String "cidade, país". 
     */
    @Override
    public String toString() {
        return (cidade + ", " + pais);
    }
}
