/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Endereco (Endereco.java)
 */
package trabalhoplp;

/**
 *
 * @author italo
 */
public class Endereco {
    public String cidade;
    public String pais;
    
    public Endereco(String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
    }
    @Override
    public String toString() {
        return (cidade + ", " + pais);
    }
}
