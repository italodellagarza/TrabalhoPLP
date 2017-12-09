/**
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Editora (Editora.java)
 */
package trabalhoplp;

/**
 * Classe para as editoras dos quadrinhos.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe
 */
public class Editora {
    private int id;
    private String nome;
    private Endereco endereco;
    private int telefone;
    
    /**
     * Construtor de classe.
     * @param id Identificador único para a editora.
     * @param nome Nome da editora.
     * @param endereco Endereço da editora.
     * @param telefone Telefone da editora.
     */
    Editora(int id, String nome, Endereco endereco, int telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
    
    /**
     * Retorna o nome da editora.
     * @return nome da editora.
     */
    public String getNome() {
        return this.nome;
    } 
    
    /**
     * Retorna a editora em forma de uma linha da jTable.
     * @return editora em forma de uma linha da jTable.
     */
    public Object[] toRowTable() {
        return new Object[]{this.id, this.nome, this.endereco.toString(), this.telefone};
    }
    
    /**
     * Método auxiliar para gravação em arquivo
     * @return String para escrever em arquivo.
     */
    @Override
    public String toString() {
        return this.nome + "\n" +
               this.endereco.cidade + "\n" +
               this.endereco.pais + "\n" +
               this.telefone;
    }
}
