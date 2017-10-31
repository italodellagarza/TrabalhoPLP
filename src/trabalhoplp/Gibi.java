/*
 * Programa para cadastro de Gibis
 * Para a disciplina de GCC198 - PLP
 * Universidade Federal de Lavras (UFLA), 2017
 */
package trabalhoplp;

/**
 * @author Ítalo Della Garza Silva
 * @author Giovane Rezende
 * Classe para os Gibis propriamente ditos.
 */
public class Gibi {
    private String nome;
    private String editora;
    private int anoPublicacao;
    public Gibi(String nome, String editora, int anoPublicacao) {
        this.nome = nome;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    // getters e setters
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome do Gibi: " + nome + "\n"
               + "Ano de Publicacao: " + anoPublicacao
               + "Editora" + editora;
    }
   
}
