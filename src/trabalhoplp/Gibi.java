/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe Ramos Palmuti
 * Classe Gibi (Gibi.java)
 */
package trabalhoplp;

/**
 * Classe para os Gibis propriamente ditos.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe Ramos Palmuti
 */
public class Gibi {
    private int id;
    private String nome;
    private String editora;
    private int anoPublicacao;
    protected int numVolumes; // Usado somente em algumas classes herdeiras
    private String autor;
    protected String genero; // Usado somente nas classes herdadas
    /**
     * Construtor de classe.
     * @param id Identificador (único).
     * @param nome Nome do gibi.
     * @param editora Nome da editora do Gibi.
     * @param anoPublicacao Ano de Publicação do Gibi.
     * @param autor Autor do Gibi.
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
     * Retornar o nome do gibi.
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * Retornar o identificador do gibi.
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * Retornar a editora do gibi.
     * @return editora
     */
    public String getEditora() {
        return editora;
    }
    /**
     * Retornar o ano de publicação do gibi
     * @return ano de publicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    /**
     * Retornar o autor do gibi
     * @return autor
     */
    public String getAutor() {
        return autor;
    }
   
    
    /**
     * Método auxiliar para escrever em arquivo.
     * @return String para escrever em arquivo.
     */
    @Override
    public String toString() {
        return this.nome + "\n" +
               this.editora + "\n" +
               this.anoPublicacao + "\n" +
               this.autor;
    }
   
}
