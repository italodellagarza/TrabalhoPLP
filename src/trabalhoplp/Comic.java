/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Comic (Comic.java)
 */
package trabalhoplp;

/**
 * Classe Comic que herda atributos de Gibi e implementa ProprietarioDeGenero.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe
 */
public class Comic extends Gibi implements ProprietarioDeGenero{
    
    public static final String[] GENEROS_COMIC = {
        "Super-Herói", "Faroeste", "Horror", "Crime"
    };
    public static final String[] ERAS_COMIC = {
        "Platina", "Ouro", "Prata", "Bronze", "Ferro"
    };
    private int numPaginas;
    public String era;
    
    /**
     * Construtor de classe.
     * @param id Identificador (da superclasse Gibi).
     * @param nome Nome (da superclasse Gibi).
     * @param editora Editora (da superclasse Gibi).
     * @param anoPublicacao Ano de Publicação (da superclasse Gibi).
     * @param autor Autor (da superclasse Gibi).
     * @param genero Gênero do comic.
     * @param numPaginas Número de páginas do comic.
     * @param numVolumes Número de Volumes do comic.
     * @param era Era do comic.
     */
    public Comic(int id, String nome, String editora, 
            int anoPublicacao, String autor, String genero, int numPaginas,
            int numVolumes, String era) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.numVolumes = numVolumes;
        this.era = era;
    }
    /**
     * Retorna o gênero do Comic.
     * @return gênero do Comic.
     */
    @Override
    public String getGenero() {
        return super.genero;
    }
    /**
     * Retorna o número de páginas do comic.
     * @return número de páginas do comic.
     */
    public int getNumPaginas() {
        return numPaginas;
    }
    /**
     * Retorna a era do comic.
     * @return era do comic.
     */
    public String getEra() {
        return era;
    }
    
    /**
     * Método auxiliar para escrever em arquivo.
     * @return String para escrever em arquivo.
     */
    @Override
    public String toString() {
        return super.toString() + "\n" +
               this.genero + "\n" +
               this.numPaginas + "\n" +
               this.numVolumes + "\n" +
               this.era;
    }
}
