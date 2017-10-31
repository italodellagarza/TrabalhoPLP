/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoplp;

/**
 *
 * @author Usaurios
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

    @Override
    public String toString() {
        return "Nome do Gibi: " + nome + "\n"
               + "Ano de Publicacao: " + anoPublicacao
               + "Editora" + editora;
    }
   
}
