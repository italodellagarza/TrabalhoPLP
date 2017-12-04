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
    private int telefone;
    
    Editora(int id, String nome, Endereco endereco, int telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        System.out.println("Telefone: " + telefone);
        
    }
    
    public String getNome() {
        return this.nome;
    } 
    
    public Object[] toRowTable() {
        return new Object[]{this.id, this.nome, this.endereco.toString(), this.telefone};
    }
}
