/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe Ramos Palmuti
 * Classe Manga (Manga.java)
 */
package trabalhoplp;


/**
 * Classe Manga que herda atributos de Gibi e implementa ProprietarioDeGenero.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe Ramos Palmuti
 */
public class Manga extends Gibi implements ProprietarioDeGenero  {
    
    public static final String[] TIPOLOGIAS_MANGA = {"Kodomo","Shonen","Shoujo","Seinen"};
    private String tipologia;
    
    /**
     * Retorna a tipologia.
     * @return tipologia.
     */
    public String getTipologia() {
        return tipologia;
    }
    
    /**
     * Construtor de classe.
     * @param id Identificador (da superclasse Gibi).
     * @param nome Nome (da superclasse Gibi).
     * @param editora Editora (da superclasse Gibi).
     * @param anoPublicacao Ano de Publicação (da superclasse Gibi).
     * @param autor Autor (da superclasse Gibi).
     * @param genero Gênero do mangá.
     * @param numVolumes Número de volumes do mangá.
     * @param tipologia Tipologia do mangá.
     */
    public Manga(int id, String nome, String editora, 
            int anoPublicacao, String autor, String genero, int numVolumes, String tipologia) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numVolumes = numVolumes;
        this.tipologia = tipologia;
    }
    
    public static String[] GENEROS_MANGA = {"Mahō shōjo","Mecha", "Harém","Ecchi"};
    
    /**
     * Retorna o gênero do mangá.
     * @return gênero do mangá.
     */
    @Override
    public String getGenero() {
        return super.genero;
    }
    
    /**
     * Método auxiliar para escrever em arquivo.
     * @return String para escrever em arquivo.
     */
    @Override
    public String toString(){
        return super.toString() + "\n" +
               this.genero + "\n" +
               this.numVolumes + "\n" +
               this.tipologia;
    }
}

