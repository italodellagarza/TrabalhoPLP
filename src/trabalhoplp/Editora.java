/**
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Editora (Editora.java)
 */
package trabalhoplp;

/**
 *
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 */
public class Editora {
    private int id;
    private String nome;
    private Endereco endereco;
    private char[] telefone;
    
    Editora(int id, String nome, Endereco endereco, char[] telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
}
