/*
 * Trabalho de Paradigmas de Linguagens de Programação
 * Cadastro de Gibis
 * Ítalo Della Garza Silva, Giovani Ferreira Andrade Botelho, Felipe
 * Classe Manga (Manga.java)
 */
package trabalhoplp;


/**
 * Classe Manga que herda atributos de Gibi e implementa ProprietarioDeGenero.
 * @author Ítalo Della Garza Silva
 * @author Giovani Ferreira Andrade Botelho
 * @author Felipe
 */
public class Manga extends Gibi implements ProprietarioDeGenero  {
    
    public static final String[] TIPOLOGIAS_MANGA = {"Kodomo","Shonen","Shoujo","Seinen"};
    private String tipologia;
    
    public String getTipologia() {
        return tipologia;
    }
    
    public Manga(int id, String nome, String editora, 
            int anoPublicacao, String autor, String genero, int numVolumes, String tipologia) {
        super(id, nome, editora, anoPublicacao, autor);
        this.genero = genero;
        this.numVolumes = numVolumes;
        this.tipologia = tipologia;
    }
    public static String[] GENEROS_MANGA = {"Mahō shōjo","Mecha", "Harém","Ecchi"};
    
    @Override
    public String getGenero() {
        return super.genero;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               this.genero + "\n" +
               this.numVolumes + "\n" +
               this.tipologia;
    }
}

