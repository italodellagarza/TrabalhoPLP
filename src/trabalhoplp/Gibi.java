/**
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Gibi (Gibi.java)
 */
package trabalhoplp;

/**
 *
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * Classe para os Gibis propriamente ditos.
 */
public class Gibi {
    private int id;
    private String nome;
    private String editora;
    private int anoPublicacao;
    protected int numVolumes;
    private String autor;
    
    /**
     * 
     * @param id
     * @param nome
     * @param editora
     * @param anoPublicacao
     * @param autor
     */
    public Gibi(int id, String nome, String editora, int anoPublicacao, 
            String autor) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
    public Gibi() {
        this.id = 0;
        this.nome = "";
        this.editora="";
        this.anoPublicacao=0;
        this.autor = "";
    }
    /**
     * 
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return editora
     */
    public String getEditora() {
        return editora;
    }
    /**
     * 
     * @return ano de publicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    /**
     * 
     * @return autor
     */
    public String getAutor() {
        return autor;
    }
    
    
    /**
     * 
     * @return debug 
     */
    @Override
    public String toString() {
        return "Nome do Gibi: " + nome + "\n"
               + "Ano de Publicacao: " + anoPublicacao
               + "Editora" + editora;
    }
   
}
